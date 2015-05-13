package cn.ericallen.travelnotes.notes.model;

import java.util.Date;

import cn.ericallen.travelnotes.common.base.BaseEntity;

public class TravelNotes extends BaseEntity{
	//游记主键
	private String pkTravelNote;
	//游记发布人令牌
	private String openId;
	//旅行时间
	private Date travelTime;
	//旅行地点
	private String travelPlace;
	//旅行特点
	private String	travelFeature;
	//旅行人数
	private int travelerNumber;
	//旅行花费
	private int travelCost;
	//注意事项
	private String travelReminder;
	//标签
	private String travelLabel;
	//游记内容
	private String travelContent;
	//游记发布时间
	private Date releaseTime;
	//是否允许分享
//	private String isAllowShare;
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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
		this.travelPlace = travelPlace;
	}
	public String getTravelFeature() {
		return travelFeature;
	}
	public void setTravelFeature(String travelFeature) {
		this.travelFeature = travelFeature;
	}
	public int getTravelerNumber() {
		return travelerNumber;
	}
	public void setTravelerNumber(int travelerNumber) {
		this.travelerNumber = travelerNumber;
	}
	public int getTravelCost() {
		return travelCost;
	}
	public void setTravelCost(int travelCost) {
		this.travelCost = travelCost;
	}
	public String getTravelReminder() {
		return travelReminder;
	}
	public void setTravelReminder(String travelReminder) {
		this.travelReminder = travelReminder;
	}
	public String getTravelLabel() {
		return travelLabel;
	}
	public void setTravelLabel(String travelLabel) {
		this.travelLabel = travelLabel;
	}
	public String getTravelContent() {
		return travelContent;
	}
	public void setTravelContent(String travelContent) {
		this.travelContent = travelContent;
	}
	public Date getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}
//	public String getIsAllowShare() {
//		return isAllowShare;
//	}
//	public void setIsAllowShare(String isAllowShare) {
//		this.isAllowShare = isAllowShare;
//	}
	public String getPkTravelNote() {
		return pkTravelNote;
	}
	public void setPkTravelNote(String pkTravelNote) {
		this.pkTravelNote = pkTravelNote;
	}





}
