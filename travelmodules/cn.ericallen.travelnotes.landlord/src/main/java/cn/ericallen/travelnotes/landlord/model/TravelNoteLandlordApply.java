package cn.ericallen.travelnotes.landlord.model;

import java.util.Date;

public class TravelNoteLandlordApply {
    private Long id;

    private String applyOpenid;

    private Date applyTime;

    private String applyReason;

    private String applyStatus;

    private String applyReply;

    private Date approvalTime;

    private Byte deleteFlag;

    private Date createTime;

    private String landlordOpenid;

    private String applyType;

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

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason == null ? null : applyReason.trim();
    }

    public String getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus == null ? null : applyStatus.trim();
    }

    public String getApplyReply() {
        return applyReply;
    }

    public void setApplyReply(String applyReply) {
        this.applyReply = applyReply == null ? null : applyReply.trim();
    }

    public Date getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
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

    public String getLandlordOpenid() {
        return landlordOpenid;
    }

    public void setLandlordOpenid(String landlordOpenid) {
        this.landlordOpenid = landlordOpenid == null ? null : landlordOpenid.trim();
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType == null ? null : applyType.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}