package com.cn.hnust.dao;


import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.cn.hnust.pojo.User;

@Repository("userDao")
public class IUserDao {
	@Resource(name = "sqlSessionFactory")
	private SqlSessionFactory sqlSessionFactory;
	public User findByTest(int id){
		
		User userByTest  = sqlSessionFactory.openSession().selectOne("userMapper.selectByTest", id);
		
		return userByTest;
	}
	
	

}
