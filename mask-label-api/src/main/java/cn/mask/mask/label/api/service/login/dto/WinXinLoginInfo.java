package cn.mask.mask.label.api.service.login.dto;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-08-22 22:00:47
 */
@Data
public class WinXinLoginInfo {
    @NotEmpty(message = "微信授权码不能为空")
    private String code;
    @Valid
    private WeiXinUserInfo weiXinUserInfo;
}
