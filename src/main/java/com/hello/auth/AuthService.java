package com.hello.auth;

import java.util.Map;

import org.springframework.stereotype.Service;
public interface AuthService {

	//���� ���� ����
	AuthVO userInfo(Map<String, Object> map);
	
}
