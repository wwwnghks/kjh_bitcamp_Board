package com.bitcamp.open.member.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bitcamp.open.member.model.Member;
import com.bitcamp.open.member.model.Member2;
import com.bitcamp.open.member.model.MemberList;
import com.bitcamp.open.member.service.MemberListService;

@Controller
@RequestMapping("/member")
public class MemberListController {

	@Autowired
	private MemberListService service;

	@RequestMapping("/list")
	public String showlist(Model model) {

		List<Member> result = service.listAll();
		model.addAttribute("mList", result);

		return "member/list";
	}

	@RequestMapping("/list.xml")
	@ResponseBody
	public MemberList getXml() {
		return getMemberList();
	}

	private MemberList getMemberList() {
		List<Member2> members = new ArrayList<Member2>();

		members = service.xml_showList();

		return new MemberList(members);
	}

	@RequestMapping("/xls")
	public ModelAndView getXlsList() {

		List<Member2> members = new ArrayList<Member2>();

		members = service.xml_showList();

		return new ModelAndView("members", "members", members);
	}


}
