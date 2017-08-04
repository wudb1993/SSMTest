package com.cn.EPhotoAlbum.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.EPhotoAlbum.dao.UserDao;
import com.cn.EPhotoAlbum.pojo.Album;
import com.cn.EPhotoAlbum.pojo.AlbumAndPhoto;
import com.cn.EPhotoAlbum.pojo.User;
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource(name="userDao")
	private UserDao userDao;
	public User getUserByNull(int id) {
		User user = userDao.getByTest(id);
		return user;
	}
	
	public User login(User user){
		List<User> userByLogin = userDao.login(user.getUserName());
		if(userByLogin.size()!=0){
		  return userByLogin.get(0);		
		}else{
			return null;
		}
	}
	public String updatePhoto(Map<String,String> mapPhoto){
		String photoResult = userDao.updatePhoto(mapPhoto);
		return photoResult;
	}
	public List<AlbumAndPhoto> mainScreen(int userId){
		List<AlbumAndPhoto> albumList = userDao.mainScreen(userId);
		return albumList;
	}

}
