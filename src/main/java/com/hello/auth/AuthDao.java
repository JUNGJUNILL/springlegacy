package com.hello.auth;

import java.util.Iterator;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AuthDao {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate; 
	
	public AuthVO userinfo(Map<String,Object> map){		
	    AuthVO userInfo = this.sqlSessionTemplate.selectOne("auth.select_one", map);
		return userInfo; 
	}
	

}
