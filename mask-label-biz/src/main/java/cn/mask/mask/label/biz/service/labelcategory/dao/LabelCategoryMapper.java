package cn.mask.mask.label.biz.service.labelcategory.dao;

import cn.mask.mask.label.biz.service.labelcategory.pojo.po.LabelCategoryPO;

public interface LabelCategoryMapper {
    int deleteByPrimaryKey(String labelCategoryId);

    int insert(LabelCategoryPO record);

    int insertSelective(LabelCategoryPO record);

    LabelCategoryPO selectByPrimaryKey(String labelCategoryId);

    int updateByPrimaryKeySelective(LabelCategoryPO record);

    int updateByPrimaryKey(LabelCategoryPO record);
}