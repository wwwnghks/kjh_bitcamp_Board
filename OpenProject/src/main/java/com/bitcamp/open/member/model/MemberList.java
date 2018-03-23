package com.bitcamp.open.member.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "member-list")
public class MemberList {
	@XmlElement(name = "member")
	private List<Member2> member;

	
	
	public MemberList() {
		super();
	}


	public MemberList(List<Member2> member) {
		super();
		this.member = member;
	}


	public List<Member2> getMember() {
		return member;
	}


}
