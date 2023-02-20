package cn.mask.mask.label.api.service.label.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2023-02-12 10:49:46
 */
@Data
public class LabelDTO {
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

    /**
     * 创建者ID
     */
    private String crterId;

    /**
     * 创建人姓名
     */
    private String crterName;

    /**
     * 创建时间
     */
    private Date crteTime;

    /**
     * 更新者ID
     */
    private String updterId;

    /**
     * 更新者名称
     */
    private String updterName;

    /**
     * 更新时间
     */
    private Date updtTime;
}
