package cn.mask.mask.label.biz.service.label.pojo.po;

import cn.mask.mask.model.BasePO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class LabelPO extends BasePO {
    /**
     * 标签ID
     */
    private String labelId;

    /**
     * 标签类别ID
     */
    private String labelCategoryId;

    /**
     * 标签名称
     */
    private String labelName;

    /**
     * 标签状态
     */
    private String state;

    /**
     * 拥有者ID
     */
    private String ownerId;

    /**
     * 激活时间
     */
    private Date activeTime;
}