package cn.mask.mask.label.biz.service.labelcategory.service.impl;

import cn.mask.mask.common.core.framework.web.WrapperResponse;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.label.api.service.labelCategory.dto.LabelCategoryDTO;
import cn.mask.mask.label.api.service.labelCategory.dto.QLabelCategoryDTO;
import cn.mask.mask.label.api.service.labelCategory.service.ILabelCategoryService;
import cn.mask.mask.label.biz.service.labelcategory.bo.ILabelCategoryBO;
import cn.mask.mask.model.dto.page.PageResult;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2023-02-20 23:07:20
 */
@Service
@RestController
@RequestMapping(value = "/api/labelCategory")
public class LabelCategoryServiceImpl implements ILabelCategoryService {
    @Resource
    private ILabelCategoryBO labelCategoryBO;

    /**
     * 查询标签类别
     *
     * @param qLabelCategoryDTO {@link QLabelCategoryDTO} 查询类别
     * @return a list of {@link QLabelCategoryDTO}
     * @throws MaskException e
     */
    @Override
    @PostMapping("/listLabelCategoryByPage")
    public WrapperResponse<PageResult<LabelCategoryDTO>> listLabelCategoryByPage(@RequestBody QLabelCategoryDTO qLabelCategoryDTO) throws MaskException {
        return WrapperResponse.success(labelCategoryBO.listLabelCategoryByPage(qLabelCategoryDTO));
    }

    /**
     * 增加标签类别
     *
     * @param labelCategoryDTOList {@link LabelCategoryDTO}
     * @return a list of {@link LabelCategoryDTO}
     * @throws MaskException e
     */
    @Override
    @PostMapping("/addLabelCategory")
    public WrapperResponse<List<LabelCategoryDTO>> addLabelCategory(@RequestBody List<LabelCategoryDTO> labelCategoryDTOList) throws MaskException {
        return WrapperResponse.success(labelCategoryBO.addLabelCategory(labelCategoryDTOList));
    }
}
