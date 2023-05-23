package cn.mask.mask.label.biz.service.label.dao;

import cn.mask.mask.label.api.service.label.dto.QLabelDTO;
import cn.mask.mask.label.biz.service.label.pojo.po.LabelPO;
import cn.mask.mask.model.base.mvc.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LabelMapper extends BaseMapper {
    int deleteByPrimaryKey(Integer labelId);

    int insert(LabelPO record);

    /**
     * 批量插入标签信息
     * @param labelPOList a list of {@link LabelPO}
     * @return  插入记录行数
     */
    int insertBatch(List<LabelPO> labelPOList);

    /**
     * 查询标签
     * @param qLabelDTO {@link QLabelDTO}
     * @return  a list of {@link LabelPO}
     */
    List<LabelPO> listLabel(QLabelDTO qLabelDTO);

    int insertSelective(LabelPO record);

    LabelPO selectByPrimaryKey(Integer labelId);

    int updateByPrimaryKeySelective(LabelPO record);

    int updateByPrimaryKey(LabelPO record);
}