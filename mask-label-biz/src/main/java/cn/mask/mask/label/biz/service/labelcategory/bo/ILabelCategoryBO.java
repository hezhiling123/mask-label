package cn.mask.mask.label.biz.service.labelcategory.bo;

import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.label.api.service.labelCategory.dto.LabelCategoryDTO;
import cn.mask.mask.label.api.service.labelCategory.dto.QLabelCategoryDTO;
import cn.mask.mask.model.dto.page.PageResult;

import java.util.List;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2023-02-23 20:23:52
 */
public interface ILabelCategoryBO {
    /**
     * 分页查询标签类别信息
     *
     * @param qLabelCategoryDTO {@link QLabelCategoryDTO} 查询标签类别信息
     * @return  标签类别查询分页结果
     * @throws MaskException e
     */
    PageResult<LabelCategoryDTO> listLabelCategoryByPage(QLabelCategoryDTO qLabelCategoryDTO) throws MaskException;

    /**
     * 增加标签类别
     *
     * @param labelCategoryDTOList  a list of {@link LabelCategoryDTO}
     * @return  a list of {@link LabelCategoryDTO}
     * @throws MaskException e
     */
    List<LabelCategoryDTO> addLabelCategory(List<LabelCategoryDTO> labelCategoryDTOList) throws MaskException;
}