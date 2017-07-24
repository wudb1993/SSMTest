package com.cn.EPhotoAlbum.pojo;

import java.util.Date;

public class Album {
	private int albumId;
	private String albumName;
	private String albumCreater;
	private Date albumDate;
	private String albumNum;
	private String albumDateNew;
	private int userId;
	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public String getAlbumCreater() {
		return albumCreater;
	}
	public void setAlbumCreater(String albumCreater) {
		this.albumCreater = albumCreater;
	}
	public Date getAlbumDate() {
		return albumDate;
	}
	public void setAlbumDate(Date albumDate) {
		this.albumDate = albumDate;
	}
	public String getAlbumNum() {
		return albumNum;
	}
	public void setAlbumNum(String albumNum) {
		this.albumNum = albumNum;
	}
	public String getAlbumDateNew() {
		return albumDateNew;
	}
	public void setAlbumDateNew(String albumDateNew) {
		this.albumDateNew = albumDateNew;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

}
