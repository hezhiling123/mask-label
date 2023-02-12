package cn.mask.mask.label.biz.service.label.dao;

import cn.mask.mask.label.biz.service.label.pojo.po.LabelPO;

public interface LabelMapper {
    int deleteByPrimaryKey(Integer labelId);

    int insert(LabelPO record);

    int insertSelective(LabelPO record);

    LabelPO selectByPrimaryKey(Integer labelId);

    int updateByPrimaryKeySelective(LabelPO record);

    int updateByPrimaryKey(LabelPO record);
}