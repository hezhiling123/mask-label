package cn.mask.mask.label.biz.service.label.bo.impl;

import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.label.api.service.label.dto.LabelDTO;
import cn.mask.mask.label.api.service.label.dto.QLabelDTO;
import cn.mask.mask.label.biz.service.label.bo.ILabelBO;
import cn.mask.mask.label.biz.service.label.dao.LabelMapper;
import cn.mask.mask.label.biz.service.label.pojo.po.LabelPO;
import cn.mask.mask.model.dto.page.PageResult;
import com.baidu.fsg.uid.impl.DefaultUidGenerator;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2023-02-13 20:55:47
 */
@Component
public class LabelBOImpl implements ILabelBO {

    @Resource
    private LabelMapper labelMapper;

    @Resource
    private DefaultUidGenerator defaultUidGenerator;

    /**
     * 添加标签
     *
     * @param labelDTOList a list of {@link LabelDTO}
     * @return a list of {@link LabelDTO}
     * @throws MaskException e
     */
    @Override
    public List<LabelDTO> addLabel(List<LabelDTO> labelDTOList) throws MaskException {
        //验证参数正确性
        List<LabelPO> labelPOList = new ArrayList<>();
        for (LabelDTO labelDTO : labelDTOList) {
            labelDTO.setLabelId(String.valueOf(defaultUidGenerator.getUID()));
            labelDTO.setCrteTime(new Date());
            labelDTO.setUpdtTime(new Date());
            LabelPO labelPO = new LabelPO();
            BeanUtils.copyProperties(labelDTO, labelPO);
            labelPOList.add(labelPO);
        }
        labelMapper.insertBatch(labelPOList);
        return labelDTOList;
    }

    /**
     * 分页查询标签
     *
     * @param qLabelDTO 查询条件{@link QLabelDTO}
     * @return 分页查询结果 {@link LabelDTO}
     * @throws MaskException e
     */
    @Override
    public PageResult<LabelDTO> listLabelByPage(QLabelDTO qLabelDTO) throws MaskException {
        labelMapper.beginPager(qLabelDTO);
        List<LabelPO> labelPOList = labelMapper.listLabel(qLabelDTO);
        return labelMapper.endPager(labelPOList, LabelDTO.class);
    }
}
