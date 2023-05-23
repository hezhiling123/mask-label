package cn.mask.mask.label.biz.service.login.pojo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-08-27 22:25:16
 */
@Data
public class UserVO implements Serializable {
    private static final long serialVersionUID = 4559674258488204311L;
    private String userId;
    private String username;
    private Integer gender;
    private String language;
    private String city;
    private String province;
    private String country;
    private String avatarUrl;
}
