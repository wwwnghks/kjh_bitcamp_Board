package com.bitcamp.open.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.bitcamp.open.member.model.Member;

public class MemberMybatisDao implements MemberDaoInter{
	
	@Autowired
	private SqlSessionTemplate session;

	private static String namespace="com.bitcamp.mapper.MemberMapper";
	
	public int memberInsert(Member member) {
		// TODO Auto-generated method stub
		return session.insert(namespace+".memberInsert",member);
	}
	public Member selectById(String MEMBER_ID) {
		Member member = session.selectOne(namespace+".selectById",MEMBER_ID);
		return member;
	}

	@Override
	public List<Member> listAll() {
		// TODO Auto-generated method stub
		List<Member> members = session.selectList(namespace+".listAll");
		return members;
	}
	@Override
	public void update(Member member) {
		// TODO Auto-generated method stub
		session.update(namespace+".update",member);
	}
	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return session.delete(namespace+".delete",id);
	}
}
