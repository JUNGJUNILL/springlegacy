package com.hello.auth;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService{

	@Autowired
	AuthDao authDao;

	
	//�α��� ���� ����
	@Override
	public AuthVO userInfo(Map<String, Object> map) {
		AuthVO userInfo = this.authDao.userinfo(map); 		
		return userInfo; 		
	}
	


	
	
	
}
