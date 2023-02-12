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
    private Integer labelId;

    /**
     * 标签类别ID
     */
    private Integer labelCategoryId;

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
    private Integer ownerId;

    /**
     * 激活时间
     */
    private Date activeTime;
}