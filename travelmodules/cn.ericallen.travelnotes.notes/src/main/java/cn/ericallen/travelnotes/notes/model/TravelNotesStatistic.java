package cn.ericallen.travelnotes.notes.model;

import cn.ericallen.travelnotes.common.base.BaseEntity;

public class TravelNotesStatistic extends BaseEntity {
	//游记记录主键
	private String pkTravelNote;
	//浏览次数
	private int browseNumber;
	//评论次数
	private int commentNumber;
	//获赞次数
	private int praiseNumber;
	//分享次数
	private int shareNumber;
	//收藏次数
	private int collectionNumber;
	public String getPkTravelNote() {
		return pkTravelNote;
	}
	public void setPkTravelNote(String pkTravelNote) {
		this.pkTravelNote = pkTravelNote;
	}
	public int getBrowseNumber() {
		return browseNumber;
	}
	public void setBrowseNumber(int browseNumber) {
		this.browseNumber = browseNumber;
	}
	public int getCommentNumber() {
		return commentNumber;
	}
	public void setCommentNumber(int commentNumber) {
		this.commentNumber = commentNumber;
	}
	public int getPraiseNumber() {
		return praiseNumber;
	}
	public void setPraiseNumber(int praiseNumber) {
		this.praiseNumber = praiseNumber;
	}
	public int getShareNumber() {
		return shareNumber;
	}
	public void setShareNumber(int shareNumber) {
		this.shareNumber = shareNumber;
	}
	public int getCollectionNumber() {
		return collectionNumber;
	}
	public void setCollectionNumber(int collectionNumber) {
		this.collectionNumber = collectionNumber;
	}


}
