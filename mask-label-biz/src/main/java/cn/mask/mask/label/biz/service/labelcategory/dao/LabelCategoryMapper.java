package cn.mask.mask.label.biz.service.labelcategory.dao;

import cn.mask.mask.label.api.service.labelCategory.dto.QLabelCategoryDTO;
import cn.mask.mask.label.biz.service.labelcategory.pojo.po.LabelCategoryPO;
import cn.mask.mask.model.base.mvc.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LabelCategoryMapper extends BaseMapper {
    int deleteByPrimaryKey(String labelCategoryId);

    int insert(LabelCategoryPO record);

    int insertSelective(LabelCategoryPO record);

    /**
     * 批量插入标签类别数据
     *
     * @param labelCategoryPOList   {@link LabelCategoryPO}
     * @return  实际插入数量
     */
    int insertBatch(@Param("labelCategoryPOList") List<LabelCategoryPO> labelCategoryPOList);

    LabelCategoryPO selectByPrimaryKey(String labelCategoryId);

    /**
     * 查询标签分类信息
     *
     * @param qLabelCategoryDTO {@link QLabelCategoryDTO}
     * @return a list of {@link LabelCategoryPO}
     */
    List<LabelCategoryPO> listLabelCategory(QLabelCategoryDTO qLabelCategoryDTO);

    int updateByPrimaryKeySelective(LabelCategoryPO record);

    int updateByPrimaryKey(LabelCategoryPO record);
}