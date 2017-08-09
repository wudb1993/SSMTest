package com.cn.EPhotoAlbum.pojo;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.cn.EPhotoAlbum.util.JsonDateSerializer;

public class User {
	private int userId;
	private String userName;
	private String userAge;
	private String userQQ;
	private String userTel;
	private String userSex;
	private String userPhone;
	private String userPassword;
	@JsonSerialize(using = JsonDateSerializer.class)
	private Date userDate;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserAge() {
		return userAge;
	}
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	public String getUserQQ() {
		return userQQ;
	}
	public void setUserQQ(String userQQ) {
		this.userQQ = userQQ;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Date getUserDate() {
		return userDate;
	}
	public void setUserDate(Date userDate) {
		this.userDate = userDate;
	}
	
	
	

}
