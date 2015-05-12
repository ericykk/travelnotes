package cn.ericallen.travelnotes.user.model;

import java.util.Date;

import cn.ericallen.travelnotes.common.base.BaseEntity;

public class User extends BaseEntity{
	//采用oauth授权登录唯一令牌
	private String openId;
	//昵称
	private String nickName;
	//性别
	private String sex;
	//所在城市
	private String city;
	//所在省
	private String province;
	//所在国家
	private String country;
	//用户首次登录时间
	private Date loginTime;
	//登录账户类型(QQ登陆 1  新浪微博登陆2  豆瓣登陆 3)
	private String loginAccountType;
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public String getLoginAccountType() {
		return loginAccountType;
	}
	public void setLoginAccountType(String loginAccountType) {
		this.loginAccountType = loginAccountType;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}




}
