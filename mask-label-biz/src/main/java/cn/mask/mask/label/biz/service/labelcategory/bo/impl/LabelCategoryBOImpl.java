package cn.mask.mask.label.biz.service.labelcategory.bo.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.label.api.service.labelCategory.dto.LabelCategoryDTO;
import cn.mask.mask.label.api.service.labelCategory.dto.QLabelCategoryDTO;
import cn.mask.mask.label.biz.service.labelcategory.bo.ILabelCategoryBO;
import cn.mask.mask.label.biz.service.labelcategory.dao.LabelCategoryMapper;
import cn.mask.mask.label.biz.common.idgenerator.SequenceGenerator;
import cn.mask.mask.label.biz.service.labelcategory.pojo.po.LabelCategoryPO;
import cn.mask.mask.model.dto.page.PageResult;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2023-02-23 20:31:52
 */
@Component
public class LabelCategoryBOImpl implements ILabelCategoryBO {
    @Resource
    private LabelCategoryMapper labelCategoryMapper;

    @Resource
    private SequenceGenerator sequenceGenerator;

    /**
     * 分页查询标签类别信息
     *
     * @param qLabelCategoryDTO {@link QLabelCategoryDTO} 查询标签类别信息
     * @return 标签类别查询分页结果
     * @throws MaskException e
     */
    @Override
    public PageResult<LabelCategoryDTO> listLabelCategoryByPage(QLabelCategoryDTO qLabelCategoryDTO) throws MaskException {
        labelCategoryMapper.beginPager(qLabelCategoryDTO);
        List<LabelCategoryPO> labelCategoryPOList = labelCategoryMapper.listLabelCategory(qLabelCategoryDTO);
        return labelCategoryMapper.endPager(labelCategoryPOList, LabelCategoryDTO.class);
    }

    /**
     * 增加标签类别
     *
     * @param labelCategoryDTOList a list of {@link LabelCategoryDTO}
     * @return a list of {@link LabelCategoryDTO}
     * @throws MaskException e
     */
    @Override
    public List<LabelCategoryDTO> addLabelCategory(List<LabelCategoryDTO> labelCategoryDTOList) throws MaskException {
        packLabelCategoryDTO(labelCategoryDTOList);
        List<LabelCategoryPO> labelCategoryPOList = BeanUtil.copyToList(labelCategoryDTOList, LabelCategoryPO.class);
        labelCategoryMapper.insertBatch(labelCategoryPOList);
        return labelCategoryDTOList;
    }

    private void packLabelCategoryDTO(List<LabelCategoryDTO> labelCategoryDTOList) {
        labelCategoryDTOList.forEach(t -> {
            t.setLabelCategoryId(sequenceGenerator.getNext("label-category", 8));
            t.setCrterId("sys");
            t.setCrterName("系统创建");
            t.setCrteTime(new Date());
            t.setUpdterId("sys");
            t.setUpdterName("系统更新");
            t.setUpdtTime(new Date());
        });
    }
}
