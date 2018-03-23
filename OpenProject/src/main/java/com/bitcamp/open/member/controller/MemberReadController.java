package com.bitcamp.open.member.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bitcamp.open.member.model.Member;
import com.bitcamp.open.member.service.MemberReadService;

@Controller
@RequestMapping("/member")
public class MemberReadController {
	
	public static final Logger logger = LoggerFactory.getLogger(MemberReadController.class);
	@Autowired
	private MemberReadService service;

	@RequestMapping("/read")
	public String read(@RequestParam("member_id") String id,Member member2,Model model) {
		logger.info(member2.toString());
		Member member = service.selectById(id);
		model.addAttribute("member", member);
		
		return "member/read";
	}

	@RequestMapping(value="/modify",method=RequestMethod.GET)
	public String modify(@RequestParam("member_id") String id,Model model,Member member2) {
		logger.info(member2.toString());
		Member member = service.selectById(id);
		model.addAttribute("member", member);
		return "member/modify";
	}
	@RequestMapping(value="/modify",method=RequestMethod.POST)
	public String modifygood(HttpServletRequest request,Member member,Model model) throws IllegalStateException, IOException {

		logger.info(member.toString());
		model.addAttribute("member", member);
		service.update(member,request);
		
		return "redirect:/member/list";
	}
	@RequestMapping("/remove")
	public String remove(@RequestParam("member_id") String id,Model model) {
		service.delete(id);
		//model.addAttribute("result", result);
		return "redirect:/member/list";
	}
}
