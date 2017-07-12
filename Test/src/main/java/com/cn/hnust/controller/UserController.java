package com.cn.hnust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cn.hnust.pojo.User;
import com.cn.hnust.service.impl.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/test",method = RequestMethod.GET)
	public ModelAndView getUserByTest(User user,Model model){
		ModelAndView mv = new ModelAndView("NewFile");
		User userByTest = userService.getUserByTest(user.getId());
		mv.addObject("user",userByTest);
		
		return mv;
	} 
}
