
package cn.ericallen.travelnotes.notes.model;
import java.util.Date;

import cn.ericallen.travelnotes.common.base.BaseEntity;

public class TravelNotesComment extends BaseEntity{

    private String pkTravelNote;

    private String commentContent;

    private Date commentTime;

    private String commentStatus;

    private String commentUser;

    private Date createTime;

    private Date updateTime;

    private String isHidden;


    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus == null ? null : commentStatus.trim();
    }

    public String getCommentUser() {
        return commentUser;
    }

    public void setCommentUser(String commentUser) {
        this.commentUser = commentUser == null ? null : commentUser.trim();
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

    public String getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(String isHidden) {
        this.isHidden = isHidden == null ? null : isHidden.trim();
    }

	public String getPkTravelNote() {
		return pkTravelNote;
	}

	public void setPkTravelNote(String pkTravelNote) {
		this.pkTravelNote = pkTravelNote;
	}

}