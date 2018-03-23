package com.bitcamp.open.member.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.springframework.web.multipart.MultipartFile;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "idx", "member_id", "member_name","regdate" })
public class Member {
	
	private int idx;
	private String member_id;
	private String member_name;
	private String password;
	private Date regdate;
	private MultipartFile photofile;
	private String photo;
	
	public Member(){}

	public Member(int idx, String member_id, String member_name, String password, Date regdate, MultipartFile photofile,
			String photo) {
		this.idx = idx;
		this.member_id = member_id;
		this.member_name = member_name;
		this.password = password;
		this.regdate = regdate;
		this.photofile = photofile;
		this.photo = photo;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public boolean matchPassword(String pw){
		return password.equals(pw);
	}

	public MultipartFile getPhotofile() {
		return photofile;
	}

	public void setPhotofile(MultipartFile photofile) {
		this.photofile = photofile;
	}

	@Override
	public String toString() {
		return "Member [idx=" + idx + ", member_id=" + member_id + ", member_name=" + member_name + ", password="
				+ password + ", regdate=" + regdate + ", photo=" + photo + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
