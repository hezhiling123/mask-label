package cn.mask.mask.label.dubbo.service.login.bo.impl;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.hutool.core.util.ObjectUtil;
import cn.mask.mask.common.core.framework.web.WrapperResponse;
import cn.mask.mask.common.core.framework.web.enums.ResultCode;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.label.api.service.login.dto.WinXinLoginInfo;
import cn.mask.mask.label.dubbo.service.login.bo.LoginBO;
import cn.mask.mask.label.dubbo.service.login.pojo.vo.UserVO;
import cn.mask.mask.user.api.login.dto.WeiXinLoginInfo;
import cn.mask.mask.user.api.register.dto.RegisterInfoDTO;
import cn.mask.mask.user.api.register.dto.RegisterResultDTO;
import cn.mask.mask.user.api.register.dto.UserBaseInfoDTO;
import cn.mask.mask.user.api.register.dto.weixin.WeiXinRegisterDTO;
import cn.mask.mask.user.api.register.enums.RegTypeEnum;
import cn.mask.mask.user.api.register.service.IRegisterService;
import cn.mask.mask.user.api.user.dto.QUserDTO;
import cn.mask.mask.user.api.user.dto.UserDTO;
import cn.mask.mask.user.api.user.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-08-27 14:31:10
 */
@Component
public class LoginBOImpl implements LoginBO {

    @Resource
    private WxMaService wxService;

    @Reference
    private IUserService userService;

    @Reference
    private IRegisterService registerService;

    /**
     * 微信登录
     *
     * @param winXinLoginInfo {@link WeiXinLoginInfo} 微信登录信息
     * @return {@link UserVO}
     * @throws Exception e
     */
    @Override
    public UserVO loginByWeiXin(WinXinLoginInfo winXinLoginInfo) throws Exception {
        if (StringUtils.isBlank(winXinLoginInfo.getCode())) {
            throw new MaskException(ResultCode.NULL_REQUIRED_PARAMETER, "微信认证code为空，无法登录");
        }
        String sessionKey;
        String openId;
        try {
            WxMaJscode2SessionResult result = this.wxService.getUserService().getSessionInfo(winXinLoginInfo.getCode());
            sessionKey = result.getSessionKey();
            openId = result.getOpenid();
        } catch (Exception e) {
            throw new MaskException(ResultCode.INVOKE_THIRD_PARTY_SERVICE_ERR, "调起微信认证服务失败" + e.getMessage());
        }
        if (StringUtils.isBlank(sessionKey) || StringUtils.isBlank(openId)) {
            throw new MaskException(ResultCode.INVOKE_THIRD_PARTY_SERVICE_ERR, "微信认证服务返回为空");
        }

        QUserDTO qUserDTO = new QUserDTO();
        qUserDTO.setOpenId(openId);
        qUserDTO.setBindType(RegTypeEnum.WEI_XIN.getType());
        WrapperResponse<UserBaseInfoDTO> queryUserByOpenIdRep = userService.queryUserByCondition(qUserDTO);
        if (!ResultCode.SUCCESS.getCode().equals(queryUserByOpenIdRep.getCode())) {
            throw new MaskException(queryUserByOpenIdRep.getCode(), queryUserByOpenIdRep.getMessage());
        }
        if (ObjectUtil.isNotNull(queryUserByOpenIdRep.getData())) {
            UserVO userVO = new UserVO();
            BeanUtils.copyProperties(queryUserByOpenIdRep.getData(), userVO);
            userVO.setNickName(queryUserByOpenIdRep.getData().getUsername());
            return userVO;
        }

        WrapperResponse<RegisterResultDTO> registerRep = registerService.registerByWeiXin(packWeiXinRegisterDTO(winXinLoginInfo, openId));
        if (!ResultCode.SUCCESS.getCode().equals(registerRep.getCode())) {
            throw new MaskException(registerRep.getCode(), registerRep.getMessage());
        }
        if (ObjectUtil.isEmpty(registerRep.getData())) {
            throw new MaskException(ResultCode.SYS_ERR, "微信注册接口返回结果为空");
        }
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(registerRep.getData(), userVO);
        userVO.setNickName(registerRep.getData().getUserName());
        return userVO;
    }

    /**
     * 组装微信注册信息
     *
     * @param winXinLoginInfo   {@link WeiXinLoginInfo}
     * @param openId 微信开放id
     * @return {@link WeiXinRegisterDTO}
     */
    private WeiXinRegisterDTO packWeiXinRegisterDTO(WinXinLoginInfo winXinLoginInfo, String openId) {
        WeiXinRegisterDTO weiXinRegisterDTO = new WeiXinRegisterDTO();
        weiXinRegisterDTO.setOpenId(openId);
        UserBaseInfoDTO userBaseInfoDTO = new UserBaseInfoDTO();
        BeanUtils.copyProperties(winXinLoginInfo.getWeiXinUserInfo(), userBaseInfoDTO);
        userBaseInfoDTO.setUsername(userBaseInfoDTO.getNickName());
        weiXinRegisterDTO.setUserBaseInfo(userBaseInfoDTO);
        RegisterInfoDTO registerInfoDTO = new RegisterInfoDTO();
        registerInfoDTO.setRegAppId("mask-label");
        registerInfoDTO.setRegAppName("mask-label");
        registerInfoDTO.setRegType(RegTypeEnum.WEI_XIN);
        weiXinRegisterDTO.setRegisterInfo(registerInfoDTO);
        return weiXinRegisterDTO;
    }
}
