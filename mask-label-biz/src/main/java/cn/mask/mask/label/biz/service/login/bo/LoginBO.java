package cn.mask.mask.label.biz.service.login.bo;

import cn.mask.mask.label.api.service.login.dto.WinXinLoginInfo;
import cn.mask.mask.label.biz.service.login.pojo.vo.UserVO;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-08-27 14:30:53
 */
public interface LoginBO {
    /**
     * 微信登录
     *
     * @param winXinLoginInfo {@link cn.mask.mask.user.api.login.dto.WeiXinLoginInfo} 微信登录信息
     * @return {@link UserVO}
     * @throws Exception e
     */
    UserVO loginByWeiXin(WinXinLoginInfo winXinLoginInfo) throws Exception;
}
