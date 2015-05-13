package cn.ericallen.travelnotes.notes.model;

import java.util.Date;

public class TravelNotesBrowse {
    private Long id;

    private String pkTravelNote;

    private Date browseTime;

    private Byte deleteFlag;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPkTravelNote() {
        return pkTravelNote;
    }

    public void setPkTravelNote(String pkTravelNote) {
        this.pkTravelNote = pkTravelNote == null ? null : pkTravelNote.trim();
    }

    public Date getBrowseTime() {
        return browseTime;
    }

    public void setBrowseTime(Date browseTime) {
        this.browseTime = browseTime;
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