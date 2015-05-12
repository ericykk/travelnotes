package cn.ericallen.travelnotes.common.base;

import java.util.Date;



public class BaseEntity {
	//主键ID
	private long id;
	//创建时间
	private Date createTime;
	//更新时间
	private Date updateTime;
	//是否删除标识
	private int deleteFlag;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public int getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(int deleteFlag) {
		this.deleteFlag = deleteFlag;
	}



}
