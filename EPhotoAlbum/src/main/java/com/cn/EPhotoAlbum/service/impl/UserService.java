package com.cn.EPhotoAlbum.service.impl;

import java.util.List;
import java.util.Map;

import com.cn.EPhotoAlbum.pojo.Album;
import com.cn.EPhotoAlbum.pojo.AlbumAndPhoto;
import com.cn.EPhotoAlbum.pojo.User;

public interface UserService {
	//测试
	public User getUserByNull(int id);
	//登录
	public User login(User user);
	//上传图片
	public String updatePhoto(Map<String,String> mapPhoto);
	//页面展示图片
	public List<AlbumAndPhoto> mainScreen(int userId);

}
