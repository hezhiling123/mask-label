package cn.mask.mask.label.api.service.label.service;

import cn.mask.mask.common.core.framework.web.WrapperResponse;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.label.api.service.label.dto.LabelDTO;
import cn.mask.mask.label.api.service.label.dto.QLabelDTO;
import cn.mask.mask.model.dto.page.PageResult;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ILabelService {
    /**
     * 创建标签
     * @param labelDTOList 标签信息列表
     * @return    a list of {@link LabelDTO}
     */
    WrapperResponse<List<LabelDTO>> addLabel(List<LabelDTO> labelDTOList);

    /**
     * 分页查询标签
     *
     * @param qLabelByPageDTO {@link QLabelDTO}
     * @return a page list of {@link LabelDTO}
     */
    WrapperResponse<PageInfo<LabelDTO>> listLabelByPage(Page<QLabelDTO> qLabelByPageDTO) throws MaskException;
}
