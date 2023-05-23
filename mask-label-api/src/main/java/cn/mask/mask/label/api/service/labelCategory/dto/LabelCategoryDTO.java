package cn.mask.mask.label.api.service.labelCategory.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

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
    private Boolean onSale;

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
