package com.bitcamp.open.member.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.open.member.dao.MemberDao;
import com.bitcamp.open.member.dao.MemberDaoInter;
import com.bitcamp.open.member.model.Member;

@Service
public class MemberLoginService {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	/*@Autowired
	MemberDao dao;*/
	private MemberDaoInter dao;
	
	public Member loginChk(String id, String pw) {
		// Member 객체를 dao 통해서 받는다. 
		dao = sqlSessionTemplate.getMapper(MemberDaoInter.class);
		Member member = dao.selectById(id);
		System.out.println("svc : " + member);
		
		// 비밀번호 체크
		if(member != null && !member.matchPassword(pw)) {
			member = null;
		}
		
		return member;
	}

	public Member selectById(String id) {
		// TODO Auto-generated method stub
		
		return dao.selectById(id);
	}
	
	
	

}





