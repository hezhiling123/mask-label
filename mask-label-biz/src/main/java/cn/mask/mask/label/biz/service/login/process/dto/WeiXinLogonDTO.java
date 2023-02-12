package cn.mask.mask.label.biz.service.login.process.dto;

import cn.mask.mask.user.api.login.dto.WeiXinUserInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-08-06 21:06:49
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class WeiXinLogonDTO extends LogonDTO {
    /**
     * 授权码
     */
    private String code;

    /**
     * 微信登录信息
     */
    private WeiXinUserInfo weiXinUserInfo;
}
