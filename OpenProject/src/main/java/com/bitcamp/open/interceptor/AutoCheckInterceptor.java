package com.bitcamp.open.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


//로그인체크 인터셉터 클래스
public class AutoCheckInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		if(session!=null) {
			Object authInfo = session.getAttribute("loginInfo");
			if(authInfo!=null) {
				//정상적으로 실행할 컨트롤러나 인터셉터를 실행
				return true;
			}
		}
		response.sendRedirect(request.getContextPath()+"/member/login"); 
		//이후에 실행할 컨트롤러나 인터셉터가 실행 되지 않는다
		return false;
	}
	

}
