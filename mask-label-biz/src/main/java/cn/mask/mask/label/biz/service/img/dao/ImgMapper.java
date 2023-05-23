package cn.mask.mask.label.biz.service.img.dao;

import cn.mask.mask.label.biz.service.img.pojo.po.ImgPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ImgMapper {
    int deleteByPrimaryKey(String imgId);

    int insert(ImgPO record);

    int insertSelective(ImgPO record);

    ImgPO selectByPrimaryKey(String imgId);

    int updateByPrimaryKeySelective(ImgPO record);

    int updateByPrimaryKey(ImgPO record);
}