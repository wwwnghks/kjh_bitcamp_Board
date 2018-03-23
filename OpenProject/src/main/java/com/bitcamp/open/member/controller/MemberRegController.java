package com.bitcamp.open.member.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitcamp.open.member.model.Member;
import com.bitcamp.open.member.service.MemberRegService;

@Controller
@RequestMapping("/member/memberReg")
public class MemberRegController {
	
	// 같은 type을 찾아서 주입
	@Autowired
	private MemberRegService memberRegService ; 
	
	@RequestMapping(method=RequestMethod.GET)
	public String memberRegForm() {
		return "member/memberRegForm";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String memberReg(Member member, Model model, HttpServletRequest request) throws Exception {
		// 서비스에  회원 데이터 저장 요청
		// 결과 : 1 / 0
		// model 에 저장
		System.out.println(member);
		
		int resultCnt = memberRegService.memberReg(member, request);
		
		String msg = "정상적으로 처리되었습니다.";
		
		if(resultCnt == 0)
			msg = "가입 처리가 되지 않았습니다. 담당자에게 문의 해주세요.";		
		
		model.addAttribute("msg", msg);
		
		
		return "member/memberReg";
	}
	
	@ExceptionHandler(IOException.class)
	public String ex1(IOException e) {
		return "error/ex1";
	}
	
	@ExceptionHandler(IllegalStateException.class)
	public String ex2(IllegalStateException e) {
		return "error/ex2";
	}
	
	
	
	
	
	
	
	

}
