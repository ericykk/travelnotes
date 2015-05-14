package cn.ericallen.travelnotes.findtraveler.model;

import java.util.Date;

public class TravelNoteFindTraveler {
    private Long id;

    private String applyOpenid;

    private Date releaseTime;

    private String findTravelersContent;

    private Byte deleteFlag;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApplyOpenid() {
        return applyOpenid;
    }

    public void setApplyOpenid(String applyOpenid) {
        this.applyOpenid = applyOpenid == null ? null : applyOpenid.trim();
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getFindTravelersContent() {
        return findTravelersContent;
    }

    public void setFindTravelersContent(String findTravelersContent) {
        this.findTravelersContent = findTravelersContent == null ? null : findTravelersContent.trim();
    }

    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}