package com.cn.EPhotoAlbum.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
//	@ResponseBody
//	@RequestMapping(value="/user",method=RequestMethod.GET)
//	public ModelAndView getUserByNull(User user){
//		ModelAndView mv = new ModelAndView();
//		User userByNull = userService.getUserByNull(user.getId());
//		mv.addObject("user", userByNull);
//		
//		return mv;
//		
//	}
	
	/**
	 * 登录判断用户名与密码
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView login(User user){
		ModelAndView mv = new ModelAndView();
		String result = userService.login(user);
		if("success".equals(result)){
			mv.setViewName("index");
		}else{
			mv.addObject("result",result);
		}
		return mv;
	}
	
	

}
