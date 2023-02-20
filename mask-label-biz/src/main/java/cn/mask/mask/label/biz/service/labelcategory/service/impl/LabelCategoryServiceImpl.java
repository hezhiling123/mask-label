package cn.mask.mask.label.biz.service.labelcategory.service.impl;

import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.label.api.service.labelCategory.dto.LabelCategoryDTO;
import cn.mask.mask.label.api.service.labelCategory.dto.QLabelCategoryDTO;
import cn.mask.mask.label.api.service.labelCategory.service.ILabelCategoryService;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2023-02-20 23:07:20
 */
@Service
public class LabelCategoryServiceImpl implements ILabelCategoryService {
    /**
     * 查询标签类别
     *
     * @param qLabelCategoryDTO {@link QLabelCategoryDTO} 查询类别
     * @return a list of {@link QLabelCategoryDTO}
     * @throws MaskException e
     */
    @Override
    public List<LabelCategoryDTO> listLabelCategory(QLabelCategoryDTO qLabelCategoryDTO) throws MaskException {
        return null;
    }

    /**
     * 增加标签类别
     *
     * @param labelCategoryDTOList {@link LabelCategoryDTO}
     * @throws MaskException e
     */
    @Override
    public void addLabelCategory(List<LabelCategoryDTO> labelCategoryDTOList) throws MaskException {

    }
}
