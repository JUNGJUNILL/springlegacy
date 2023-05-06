package com.hello.auth;

public class AuthVO {
	
	private String userId; 
	private String email;
	private String loginLevel;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLoginLevel() {
		return loginLevel;
	}
	public void setLoginLevel(String loginLevel) {
		this.loginLevel = loginLevel;
	} 
	
	

}
