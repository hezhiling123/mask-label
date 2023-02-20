package cn.mask.mask.label.api.service.labelCategory.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2023-02-12 20:18:35
 */
@Data
public class LabelCategoryDTO implements Serializable {
    private static final long serialVersionUID = -5823643222797627996L;

    /**
     * 标签类型Id
     */
    private String labelCategoryId;

    /**
     * 标签类型名称
     */
    private String labelCategoryName;

    /**
     * 图片地址
     */
    private String picUrl;

    /**
     * 分项地址
     */
    private String shareUrl;

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
