package cn.mask.mask.label.dubbo.service.label.dao;

import cn.mask.mask.label.dubbo.service.label.pojo.po.LabelPO;

public interface LabelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LabelPO record);

    int insertSelective(LabelPO record);

    LabelPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LabelPO record);

    int updateByPrimaryKey(LabelPO record);
}