package com.bitcamp.open.member.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bitcamp.open.member.model.Member;
import com.bitcamp.open.member.model.Member2;


public class MemberDao {
	
	private JdbcTemplate jdbcTemplate;
	
	// 생성자 방식으로 의존 설정
	public MemberDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int insertMember(Member member) {
		
		String sql = "insert into member (member_id, member_name, password, photo ) "
				+ " values ( ?, ?, ?, ? )";
		
		int resultCnt = jdbcTemplate.update(
				sql, 
				member.getMember_id(), 
				member.getMember_name(), 
				member.getPassword(),
				member.getPhoto());
		
		
		return resultCnt;
	}

	public Member selectById(String id) {
		
		String sql = "select * from member where member_id = ?";
		
		List<Member> result = jdbcTemplate.query(sql, 
				new RowMapper<Member>() {
					
					@Override
					public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
						Member member = new Member();
						member.setIdx(rs.getInt("idx"));
						member.setMember_id(rs.getString("member_id"));						
						member.setMember_name(rs.getString("member_name"));
						member.setPassword(rs.getString("password"));
						member.setRegdate(rs.getDate("regdate"));
						member.setPhoto(rs.getString("photo"));
						return member;
					}
				}, 
				id);
		
		return result.isEmpty() ? null : result.get(0);
		
		
	}

	public List<Member> showList() {
		// TODO Auto-generated method stub
		String sql = "select member_id,member_name,regdate,photo from member";
		List<Member> result = jdbcTemplate.query(sql,new RowMapper<Member>() {

			@Override
			public Member mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				Member mem = new Member();
				mem.setMember_id(rs.getString("member_id"));						
				mem.setMember_name(rs.getString("member_name"));
				mem.setRegdate(rs.getDate("regdate"));
				mem.setPhoto(rs.getString("photo"));
				return mem;
			}
		});
		return result.isEmpty() ? null : result;
	}
	
	public List<Member2> xml_showList() {
		// TODO Auto-generated method stub
		String sql = "select idx,member_id,member_name,regdate from member";
		List<Member2> result = jdbcTemplate.query(sql,new RowMapper<Member2>() {

			@Override
			public Member2 mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				Member2 mem = new Member2();
				mem.setIdx(rs.getInt("idx"));
				mem.setMember_id(rs.getString("member_id"));						
				mem.setMember_name(rs.getString("member_name"));
				mem.setRegdate(rs.getDate("regdate"));
				return mem;
			}
		});
		return result.isEmpty() ? null : result;
	}

}
