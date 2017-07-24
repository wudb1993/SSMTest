package com.cn.EPhotoAlbum.service.impl;

import java.util.List;

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
	
	public String login(User user){
		List<User> userByLogin = userDao.login(user.getUserName());
		if(userByLogin.size()!=0){
			if(userByLogin.get(0).getUserPassword().equals(user.getUserPassword())){
				return "success";
			}else{
				return "用户名密码不匹配";
			}
			
		}else{
			return "用户不存在";
		}
	}

}
