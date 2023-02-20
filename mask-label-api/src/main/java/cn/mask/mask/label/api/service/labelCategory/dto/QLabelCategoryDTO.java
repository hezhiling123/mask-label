package cn.mask.mask.label.api.service.labelCategory.dto;

import cn.mask.mask.model.dto.page.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2023-02-20 23:04:15
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QLabelCategoryDTO extends PageInfo {
    /**
     * 标签类型Id
     */
    private String labelCategoryId;

    /**
     * 标签类型名称
     */
    private String labelCategoryName;
    /**
     * 是否上架
     */
    private Byte onSale;

    /**
     * 是否新品
     */
    private Boolean newFlag;

    /**
     * 是否热卖
     */
    private Byte hotFlag;
}
