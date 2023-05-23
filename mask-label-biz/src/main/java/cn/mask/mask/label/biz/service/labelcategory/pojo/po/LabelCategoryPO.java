package cn.mask.mask.label.biz.service.labelcategory.pojo.po;

import cn.mask.mask.model.BasePO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class LabelCategoryPO extends BasePO {
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
}