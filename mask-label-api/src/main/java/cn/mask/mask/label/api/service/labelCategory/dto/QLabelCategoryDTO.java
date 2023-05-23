package cn.mask.mask.label.api.service.labelCategory.dto;

import cn.mask.mask.model.dto.page.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2023-02-20 23:04:15
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QLabelCategoryDTO extends PageInfo {
    private static final long serialVersionUID = 5620456421212711372L;
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
    private Boolean onSale;

    /**
     * 创建者Id
     */
    private String crterId;
    /**
     * 创建者名称
     */
    private String crterName;
    /**
     * 创建时间
     */
    private Date crteTime;
    /**
     * 更新者Id
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
