package com.cn.EPhotoAlbum.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.cn.EPhotoAlbum.dao.UserDao;
import com.cn.EPhotoAlbum.pojo.Album;
import com.cn.EPhotoAlbum.pojo.AlbumAndPhoto;
import com.cn.EPhotoAlbum.pojo.User;
import com.cn.EPhotoAlbum.service.impl.UserService;

@Controller
@RequestMapping(value="/test")
public class UserController {
	@Resource(name="userService")
	private UserService userService;
	@Resource(name="userDao")
	private UserDao userDao;
	

	
	/**
	 * 登录判断用户名与密码
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView login(User user,HttpSession session){
		ModelAndView mv = new ModelAndView();
		User userResult = userService.login(user);
		if(userResult!=null){
			if(userResult.getUserPassword().equals(user.getUserPassword())){
				 session.setAttribute("userName", user.getUserName());
				 session.setAttribute("userPassword", user.getUserPassword());
				 session.setAttribute("userId", userResult.getUserId());
				 mv.addObject("result","success");
			}else{
				mv.addObject("result","用户名密码不匹配");
			}
		}else{
			mv.addObject("result","用户不存在");
		}
	/*	Cookie cokUser = new Cookie("userCookie", "userCookie");
		cokUser.setMaxAge(30 * 60);// 设置存在时间为30分钟
		cokUser.setPath("/");//设置作用域
		
        //将cookie添加到response的cookie数组中返回给客户端
			mv.addObject("result",result);
		*/
		
		return mv;
	}
	//展示页面相册
	@ResponseBody
	@RequestMapping(value="/mianScreen",method=RequestMethod.POST)
	public ModelAndView mainScreen(HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
//		int userId = (Integer) request.getSession().getAttribute("userId");
		List<AlbumAndPhoto> albumList = userService.mainScreen(1);
		
		mv.addObject("albumList", albumList);
	
		return mv;
	}
	/**
	 * 上传照片，保存到服务器中，并将照片的相关信息存储到数据库中
	 * @param photoName
	 * @param photoPath
	 * @return
	 */
	@RequestMapping(value="/updatePhoto",method=RequestMethod.POST)
	public ModelAndView updatePhoto(@RequestParam(value="file",required=false)MultipartFile file,HttpServletRequest request,HttpServletResponse response){

		ModelAndView mv = new ModelAndView();
		String userName=(String) request.getSession().getAttribute("userName");
		try {
			//拷贝一个字节流到一个文件中，如果这个文件不存在则新创建一个，存在的话将被重写进内容
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File("E:/wer/", file.getOriginalFilename()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Map<String,String> mapPhoto = new HashMap<String, String>();
		mapPhoto.put("photoName", file.getOriginalFilename());
		Date photoDate = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		mapPhoto.put("photoDate",sd.format(photoDate));
		mapPhoto.put("photoCreater", userName);
		
		try {
			mapPhoto.put("photoNum", file.getBytes().length+"");
		} catch (IOException e) {
			e.printStackTrace();
		}
		mapPhoto.put("photoSrc", "E:/wer/"+file.getOriginalFilename());
		String photoResult="";
		try{
			photoResult = userService.updatePhoto(mapPhoto);
		}catch(Exception e){
			mv.setViewName("errorPhoto");
		}
		if(photoResult.equals("success")){
			mv.setViewName("index");
		}else{
			mv.setViewName("errorPhoto");
		}
		return mv;
	}
	

}
