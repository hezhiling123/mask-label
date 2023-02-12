package cn.mask.mask.label.biz.service.login.process.dto;

import cn.mask.mask.user.api.register.dto.UserBaseInfoDTO;
import lombok.Data;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-08-06 21:16:45
 */
@Data
public class LoginResultDTO {
    private UserBaseInfoDTO baseInfo;
}
