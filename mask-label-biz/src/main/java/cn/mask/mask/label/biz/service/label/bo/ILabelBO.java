package cn.mask.mask.label.biz.service.label.bo;

import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.label.api.service.label.dto.LabelDTO;
import cn.mask.mask.label.api.service.label.dto.QLabelDTO;
import cn.mask.mask.model.dto.page.PageInfo;
import cn.mask.mask.model.dto.page.PageResult;

import java.util.List;

/**
 * @author hezhiling
 */
public interface ILabelBO {
    /**
     * 添加标签
     *
     * @param labelDTOList a list of {@link LabelDTO}
     * @return a list of {@link LabelDTO}
     * @throws MaskException e
     */
    List<LabelDTO> addLabel(List<LabelDTO> labelDTOList) throws MaskException;

    /**
     * 分页查询标签
     *
     * @param qLabelDTO 查询条件{@link QLabelDTO}
     * @return 分页查询结果 {@link LabelDTO}
     * @throws MaskException e
     */
    PageResult<LabelDTO> listLabelByPage(QLabelDTO qLabelDTO) throws MaskException;
}
