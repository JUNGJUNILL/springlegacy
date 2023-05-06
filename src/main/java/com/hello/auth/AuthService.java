package com.hello.auth;

import java.util.Map;

import org.springframework.stereotype.Service;
public interface AuthService {

	//유저 정보 저장
	AuthVO userInfo(Map<String, Object> map);
	
}
