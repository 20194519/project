package com.smart.project.web.login.biz;

import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Service
public class LoginUserService {
	private static final String CONTEXT_DOMAIN = ".yeoboya.com";
	
	/**********************************************************************************************
	 * @Method 설명 : 쿠키 생성
	 * @작성일 : 2021-09-02
	 * @작성자 : 김남현
	 * @변경이력 :
	 **********************************************************************************************/
	public void createCookie(HttpServletResponse res, String name, String value){
		Cookie c = new Cookie(name, value);
		c.setComment(name);
		c.setPath("/");
		c.setDomain(CONTEXT_DOMAIN);
		//        c.setMaxAge(0);
		res.addCookie(c);
	}
}
