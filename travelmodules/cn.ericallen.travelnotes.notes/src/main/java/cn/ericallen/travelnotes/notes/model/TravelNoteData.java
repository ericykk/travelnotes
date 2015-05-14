package cn.ericallen.travelnotes.notes.model;

import java.util.Date;

public class TravelNoteData {
    private Long id;

    private String openid;

    private Date travelTime;

    private String travelPlace;

    private String travelFeature;

    private Integer travelerNumber;

    private Integer travelCost;

    private String travelReminder;

    private String travelLabel;

    private String travelContent;

    private Date releaseTime;

    private Byte deleteFlag;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public Date getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Date travelTime) {
        this.travelTime = travelTime;
    }

    public String getTravelPlace() {
        return travelPlace;
    }

    public void setTravelPlace(String travelPlace) {
        this.travelPlace = travelPlace == null ? null : travelPlace.trim();
    }

    public String getTravelFeature() {
        return travelFeature;
    }

    public void setTravelFeature(String travelFeature) {
        this.travelFeature = travelFeature == null ? null : travelFeature.trim();
    }

    public Integer getTravelerNumber() {
        return travelerNumber;
    }

    public void setTravelerNumber(Integer travelerNumber) {
        this.travelerNumber = travelerNumber;
    }

    public Integer getTravelCost() {
        return travelCost;
    }

    public void setTravelCost(Integer travelCost) {
        this.travelCost = travelCost;
    }

    public String getTravelReminder() {
        return travelReminder;
    }

    public void setTravelReminder(String travelReminder) {
        this.travelReminder = travelReminder == null ? null : travelReminder.trim();
    }

    public String getTravelLabel() {
        return travelLabel;
    }

    public void setTravelLabel(String travelLabel) {
        this.travelLabel = travelLabel == null ? null : travelLabel.trim();
    }

    public String getTravelContent() {
        return travelContent;
    }

    public void setTravelContent(String travelContent) {
        this.travelContent = travelContent == null ? null : travelContent.trim();
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
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