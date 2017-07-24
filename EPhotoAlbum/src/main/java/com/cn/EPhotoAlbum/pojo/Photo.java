package com.cn.EPhotoAlbum.pojo;

import java.util.Date;

public class Photo {
	private int photoId;
	private String photoName;
	private Date photoDate;
	private String photoCreater;
	private String photoNum;
	private String photoSrc;
	private int albumId;
	public int getPhotoId() {
		return photoId;
	}
	public void setPhotoId(int photoId) {
		this.photoId = photoId;
	}
	public String getPhotoName() {
		return photoName;
	}
	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}
	public Date getPhotoDate() {
		return photoDate;
	}
	public void setPhotoDate(Date photoDate) {
		this.photoDate = photoDate;
	}
	public String getPhotoCreater() {
		return photoCreater;
	}
	public void setPhotoCreater(String photoCreater) {
		this.photoCreater = photoCreater;
	}
	public String getPhotoNum() {
		return photoNum;
	}
	public void setPhotoNum(String photoNum) {
		this.photoNum = photoNum;
	}
	public String getPhotoSrc() {
		return photoSrc;
	}
	public void setPhotoSrc(String photoSrc) {
		this.photoSrc = photoSrc;
	}
	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	
	

}
