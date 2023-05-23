package cn.mask.mask.label.biz.service.login;

import cn.mask.mask.common.core.framework.web.WrapperResponse;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.label.api.service.login.dto.WinXinLoginInfo;
import cn.mask.mask.label.biz.service.login.bo.LoginBO;
import cn.mask.mask.label.biz.service.login.pojo.vo.UserVO;
import cn.mask.mask.label.biz.service.login.process.dto.LogonDTO;
import cn.mask.mask.user.api.login.dto.WeiXinUserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author mask
 */
@Slf4j
@RestController
@RequestMapping("/api/login")
public class LoginController {

    @Resource
    private LoginBO loginBO;

    /**
     * 微信登录
     *
     * @param winXinLoginInfo 请求内容，{ code: xxx, userInfo: xxx }
     * @return 登录结果
     **/
    @PostMapping("loginByWeiXin")
    public WrapperResponse<UserVO> loginByWeiXin(@RequestBody WinXinLoginInfo winXinLoginInfo) throws Exception {
        UserVO userVO = loginBO.loginByWeiXin(winXinLoginInfo);
        return WrapperResponse.success(userVO);
    }

    /**
     * 通过token登录
     *
     * @param tokenStr token
     * @return {@link UserPO}
     */
    @PostMapping("login")
    public WrapperResponse<WeiXinUserInfo> login(LogonDTO logonDTO) {
        return null;
    }

    /**
     * 通过token登录
     *
     * @param tokenStr token
     * @return {@link WeiXinUserInfo}
     */
    @PostMapping("loginByToken")
    public WrapperResponse<WeiXinUserInfo> loginByToken(String tokenStr) throws MaskException {
        return null;
    }

//    private void checkUserStatus(UserPO user) throws MaskException {
//        // 用户未激活
//        if (CommonConstant.USER_STATUS_NO_ACTIVATION.equals(user.getStatus())) {
//            throw new MaskException(ResultStatusCode.NOT_PARAM_USER_OR_ERROR_PWD,
//                    ResponseCodeConstant.USER_LOGIN_FAIL_NO_ACTIVATION_MSG);
//        }
//        // 用户已冻结
//        if (CommonConstant.USER_STATUS_FREEZE.equals(user.getStatus())) {
//            throw new MaskException(ResultStatusCode.USER_FROZEN,
//                    ResponseCodeConstant.USER_LOGIN_FAIL_FREEZEED_MSG);
//        }
//        // 用户已作废
//        if (CommonConstant.USER_STATUS_CANCEL.equals(user.getStatus())) {
//            throw new MaskException(ResultStatusCode.USER_FROZEN,
//                    ResponseCodeConstant.USER_LOGIN_FAIL_CANCELED_MSG);
//        }
//    }
}