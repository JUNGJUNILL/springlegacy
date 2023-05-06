package com.hello.auth;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/auth")
public class LoginController {
	
	
	@Autowired
	AuthService authService;
	
	@RequestMapping(value="/login" , method = RequestMethod.GET)
	public String loginView() {
		
		return "/auth/login"; 
	}
	
	@RequestMapping(value="/login" , method = RequestMethod.POST)
	public void login(@RequestParam Map<String,Object> map, HttpSession session) {
		
		AuthVO userInfo = this.authService.userInfo(map);
		if(userInfo != null) {
			session.setAttribute("userid", userInfo.getUserId());
			session.setAttribute("userLevel", userInfo.getLoginLevel());
			session.setAttribute("useremail", userInfo.getEmail());
		}
	}
}
