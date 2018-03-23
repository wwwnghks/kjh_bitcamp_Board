package com.bitcamp.open.member.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.open.member.dao.MemberDao;
import com.bitcamp.open.member.dao.MemberDaoInter;
import com.bitcamp.open.member.model.Member;
import com.bitcamp.open.member.model.Member2;

@Service
public class MemberListService {
	
	private MemberDao dao;
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	private MemberDaoInter dao1;
	
	public List<Member> listAll(){
		dao1=sqlSessionTemplate.getMapper(MemberDaoInter.class);
		
		List<Member> mList = dao1.listAll();
		
		return mList;
		
	}
	
	public List<Member2> xml_showList(){
		List<Member2> xList = dao.xml_showList();
		return xList;
	}
}
