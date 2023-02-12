package cn.mask.mask.label.biz.service.labelcategory.pojo.po;

import cn.mask.mask.model.BasePO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class LabelCategoryPO extends BasePO {
    private String labelCategoryId;

    private String labelCategoryName;

    private String picUrl;

    private String shareUrl;

    private Byte onSale;

    private Boolean newFlag;

    private Byte hotFlag;
}