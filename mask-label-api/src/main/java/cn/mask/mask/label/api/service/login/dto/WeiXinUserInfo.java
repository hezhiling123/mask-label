package cn.mask.mask.label.api.service.login.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-08-22 22:02:23
 */
@Data
public class WeiXinUserInfo {
    @NotBlank(
            message = "用户昵称不可为空"
    )
    private String nickName;
    @NotBlank(
            message = "性别不可为空"
    )
    private Integer gender;
    @NotBlank(
            message = "语言不可为空"
    )
    private String language;
    private String city;
    private String province;
    private String country;
    private String avatarUrl;
}
