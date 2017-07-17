package com.cn.EPhotoAlbum.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.EPhotoAlbum.dao.UserDao;
import com.cn.EPhotoAlbum.pojo.User;
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource(name="userDao")
	private UserDao userDao;
	public User getUserByNull(int id) {
		User user = userDao.getByTest(id);
		return user;
	}

}
