package cn.mask.mask.label.dubbo.service.label.pojo.po;

import lombok.Data;

import java.util.Date;

public class LabelPO {
    private Integer id;

    private Integer labelCategoryId;

    private String labelName;

    private Integer ownerId;

    private Date createTime;

    private Date openTime;

    private Boolean open;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLabelCategoryId() {
        return labelCategoryId;
    }

    public void setLabelCategoryId(Integer labelCategoryId) {
        this.labelCategoryId = labelCategoryId;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName == null ? null : labelName.trim();
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }
}