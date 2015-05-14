package cn.ericallen.travelnotes.landlord.model;

import java.util.Date;

public class TravelNoteLandlord {
    private Long id;

    private String openid;

    private Date landlordTime;

    private String landlordIntroduction;

    private Integer landlordPraiseNumber;

    private Integer landlordCriticismNumber;

    private String landlordStatus;

    private String isActive;

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

    public Date getLandlordTime() {
        return landlordTime;
    }

    public void setLandlordTime(Date landlordTime) {
        this.landlordTime = landlordTime;
    }

    public String getLandlordIntroduction() {
        return landlordIntroduction;
    }

    public void setLandlordIntroduction(String landlordIntroduction) {
        this.landlordIntroduction = landlordIntroduction == null ? null : landlordIntroduction.trim();
    }

    public Integer getLandlordPraiseNumber() {
        return landlordPraiseNumber;
    }

    public void setLandlordPraiseNumber(Integer landlordPraiseNumber) {
        this.landlordPraiseNumber = landlordPraiseNumber;
    }

    public Integer getLandlordCriticismNumber() {
        return landlordCriticismNumber;
    }

    public void setLandlordCriticismNumber(Integer landlordCriticismNumber) {
        this.landlordCriticismNumber = landlordCriticismNumber;
    }

    public String getLandlordStatus() {
        return landlordStatus;
    }

    public void setLandlordStatus(String landlordStatus) {
        this.landlordStatus = landlordStatus == null ? null : landlordStatus.trim();
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive == null ? null : isActive.trim();
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