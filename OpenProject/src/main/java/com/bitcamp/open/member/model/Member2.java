package com.bitcamp.open.member.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.springframework.web.multipart.MultipartFile;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "idx", "member_id", "member_name","regdate" })
public class Member2 {
	
	private int idx;
	private String member_id;
	private String member_name;
	private Date regdate;

	
	public Member2(){}


	public Member2(int idx, String member_id, String member_name, Date regdate) {
		super();
		this.idx = idx;
		this.member_id = member_id;
		this.member_name = member_name;
		this.regdate = regdate;
	}





	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}


	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}


	@Override
	public String toString() {
		return "Member2 [idx=" + idx + ", member_id=" + member_id + ", member_name=" + member_name + ", regdate="
				+ regdate + "]";
	}




}
