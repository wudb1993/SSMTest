package com.cn.EPhotoAlbum.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.cn.EPhotoAlbum.pojo.Album;
import com.cn.EPhotoAlbum.pojo.AlbumAndPhoto;
import com.cn.EPhotoAlbum.pojo.User;

@Repository("userDao")
public class UserDao {
	@Resource(name="sqlSessionFactory")
	private SqlSessionFactory sqlSessionFactory;
	
	public User getByTest(int id){
		User user = sqlSessionFactory.openSession().selectOne("userMapper.userByNull",id);
		return user;
	}
	//登录验证
	public List<User> login(String userName){ 
	   List<User>	userByLogin = sqlSessionFactory.openSession().selectList("userMapper.userByLogin", userName);
	   return userByLogin;
	}
	//上传图片
	public String updatePhoto(Map<String,String> mapPhoto){
		int photoResult = sqlSessionFactory.openSession().insert("phtotMapper.updatePhoto", mapPhoto);
		if(photoResult>0){
			return "success";
		}
		return "fault";
	}
	//页面展示相册
	public List<AlbumAndPhoto> mainScreen(int userId){
		
		List<AlbumAndPhoto> albumPhoto =  sqlSessionFactory.openSession().selectList("albumMapper.mainScreen",userId+"");
		return albumPhoto;
	}
}
