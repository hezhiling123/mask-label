package cn.mask.mask.label.biz.service.img.pojo.dto;

import lombok.Data;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2023-02-27 22:04:58
 */
@Data
public class ImgDTO {
    /**
     * 图片Id
     */
    private String imgId;

    /**
     * 图片类型
     */
    private String imgType;

    /**
     * 图片类型名称
     */
    private String imgTypeName;

    /**
     * 图片地址
     */
    private String imgUrl;

    /**
     * 使用系统编码
     */
    private String usedSysCode;

    /**
     * 使用系统名称
     */
    private String usedSysName;

    /**
     * 表名
     */
    private String tabelName;

    /**
     * 表名描述
     */
    private String tabelNameDscr;

    /**
     * 有效标志
     */
    private String valiFlag;
}
