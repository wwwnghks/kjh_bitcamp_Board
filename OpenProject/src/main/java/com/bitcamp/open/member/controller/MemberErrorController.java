package com.bitcamp.open.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/error")
public class MemberErrorController {
	
	@RequestMapping("/ex1")
	public String ex1() {
		return "error/ex1";
	}
	
	@RequestMapping("/ex2")
	public String ex2() {
		return "error/ex2";
	}
}
