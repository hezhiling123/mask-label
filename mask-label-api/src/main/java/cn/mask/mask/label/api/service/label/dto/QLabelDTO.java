package cn.mask.mask.label.api.service.label.dto;

import cn.mask.mask.model.dto.page.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2023-02-12 19:28:04
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QLabelDTO extends PageInfo {
    private static final long serialVersionUID = -5045470524675227451L;
    private String labelId;
    private String ownerId;
    private List<String> stateList;
}
