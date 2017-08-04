package com.cn.EPhotoAlbum.pojo;

import java.util.Date;
import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import com.cn.EPhotoAlbum.util.JsonDateSerializer;


public class Album {
	private int albumId;
	private String albumName;
	private String albumCreater;
	@JsonSerialize(using = JsonDateSerializer.class)
	private Date albumDate;
	private String albumNum;
	@JsonSerialize(using = JsonDateSerializer.class)
	private Date albumDateNew;
	private int userId;
	
	
	
	
	public Date getAlbumDateNew() {
		return albumDateNew;
	}
	public void setAlbumDateNew(Date albumDateNew) {
		this.albumDateNew = albumDateNew;
	}
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
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

}
