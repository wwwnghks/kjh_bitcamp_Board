package com.bitcamp.open.member.dao;

import java.util.List;

import com.bitcamp.open.member.model.Member;

public interface MemberDaoInter {
	public Member selectById(String id);

	public int memberInsert(Member member);
	
	public List<Member> listAll();
	
	public void update(Member member);
	
	public int delete(String id);
}
