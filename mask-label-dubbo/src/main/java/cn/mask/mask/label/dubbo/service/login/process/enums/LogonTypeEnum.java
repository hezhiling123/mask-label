package cn.mask.mask.label.dubbo.service.login.process.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-08-06 20:40:36
 */
@Getter
@AllArgsConstructor
public enum  LogonTypeEnum {
    WEI_XIN("WEI_XIN", "微信"),
    PHONE("PHONE", "手机号"),
    EMAIL("EMAIL", "邮箱");

    /**
     * 登录方式
     */
    private final String type;

    /**
     * 登录方式描述
     */
    private final String desc;

    public Boolean isIllegalLogonType(String type) {
        if (StringUtils.isEmpty(type)) {
            return Boolean.FALSE;
        }
        for (LogonTypeEnum logonTypeEnum : LogonTypeEnum.values()) {
            if (logonTypeEnum.getType().equals(type)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
