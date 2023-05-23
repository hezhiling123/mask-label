package cn.mask.mask.label.biz.service.label;

import cn.mask.mask.common.core.framework.web.WrapperResponse;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.label.api.service.label.dto.LabelDTO;
import cn.mask.mask.label.api.service.label.dto.QLabelDTO;
import cn.mask.mask.label.api.service.label.service.ILabelService;
import cn.mask.mask.label.biz.service.label.bo.ILabelBO;
import cn.mask.mask.model.dto.page.PageResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-05-03 23:57:32
 */

@RequestMapping(value = "/api/label")
public class LabelServiceImpl implements ILabelService {

    @Resource
    private ILabelBO labelBO;

    /**
     * 创建标签
     *
     * @param labelDTOList 标签信息列表
     * @return a list of {@link LabelDTO}
     */
    @Override
    @PostMapping("/addLabel")
    public WrapperResponse<List<LabelDTO>> addLabel(@RequestBody List<LabelDTO> labelDTOList) {
        return null;
    }

    /**
     * 分页查询标签
     *
     * @param qLabelDTO {@link QLabelDTO}
     * @return a page list of {@link LabelDTO}
     */
    @Override
    @PostMapping("/listLabelByPage")
    public WrapperResponse<PageResult<LabelDTO>> listLabelByPage(@RequestBody QLabelDTO qLabelDTO) throws MaskException {
        return WrapperResponse.success(labelBO.listLabelByPage(qLabelDTO));
    }
}
