package com.cn.EPhotoAlbum.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cn.EPhotoAlbum.dao.UserDao;
import com.cn.EPhotoAlbum.pojo.User;
import com.cn.EPhotoAlbum.service.impl.UserService;

@Controller
@RequestMapping(value="/test")
public class UserController {
	@Resource(name="userService")
	private UserService userService;
	@Resource(name="userDao")
	private UserDao userDao;
	
	@RequestMapping(value="/user")
	public ModelAndView getUserByNull(User user){
		ModelAndView mv = new ModelAndView("NewFile");
		
		return mv;
		
	}

}
