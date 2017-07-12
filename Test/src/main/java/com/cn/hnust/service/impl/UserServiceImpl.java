package com.cn.hnust.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.hnust.dao.IUserDao;
import com.cn.hnust.pojo.User;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource(name="userDao")
	private IUserDao userDao;

	public User getUserByTest(int id) {
		User user = userDao.findByTest(id);
		return user;
	}

	
	
	

}
