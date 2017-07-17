package com.cn.EPhotoAlbum.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.cn.EPhotoAlbum.pojo.User;

@Repository("userDao")
public class UserDao {
	@Resource(name="sqlSessionFactory")
	private SqlSessionFactory sqlSessionFactory;
	
	public User getByTest(int id){
		User user = sqlSessionFactory.openSession().selectOne("userMapper.userByNull",id);
		return user;
	}

}
