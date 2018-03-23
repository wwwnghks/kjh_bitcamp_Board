package com.bitcamp.open.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitcamp.open.member.model.Member;
import com.bitcamp.open.member.service.MemberLoginService;

@Controller
@RequestMapping("member/login")
public class MemberLoginController {
	
	@Autowired
	private MemberLoginService memberLoginService;
	

	@RequestMapping(method=RequestMethod.GET)
	public String loginForm() {
		return "member/loginForm";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String login(
			@RequestParam(value="member_id", defaultValue="0") String id,
			@RequestParam(value="password", required=false) String pw,
			HttpSession session
			) {
		
		System.out.println(id);
		System.out.println(pw);
				
		// 정상적으로 로그인 처리가 되면 리다이렉트 처리 : mypage로 이동		
		String view = "redirect:mypage"; //    /member/mypage
		
		Member member = memberLoginService.loginChk(id, pw);
		// null / Member 객체
		
		if (member == null) {
			return "member/loginFail";
		}
		
		// 세션에 데이터 저장
		session.setAttribute("loginInfo", member);
		
		System.out.println(session.getAttribute("loginInfo"));
		
		return view;
	}
	
	
	
	
	
	
	
}
