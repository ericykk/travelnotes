package cn.ericallen.travelnotes.notes.model;

import java.util.Date;

public class TravelNotePraise {
    private Long id;

    private Long pkTravelNote;

    private Date praiseTime;

    private String praiseUser;

    private Byte deleteFlag;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPkTravelNote() {
        return pkTravelNote;
    }

    public void setPkTravelNote(Long pkTravelNote) {
        this.pkTravelNote = pkTravelNote;
    }

    public Date getPraiseTime() {
        return praiseTime;
    }

    public void setPraiseTime(Date praiseTime) {
        this.praiseTime = praiseTime;
    }

    public String getPraiseUser() {
        return praiseUser;
    }

    public void setPraiseUser(String praiseUser) {
        this.praiseUser = praiseUser == null ? null : praiseUser.trim();
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