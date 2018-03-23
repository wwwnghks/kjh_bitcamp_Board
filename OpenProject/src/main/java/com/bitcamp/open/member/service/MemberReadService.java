package com.bitcamp.open.member.service;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.open.member.dao.MemberDaoInter;
import com.bitcamp.open.member.model.Member;

@Service
public class MemberReadService {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	private MemberDaoInter dao;

	public Member selectById(String id) {
		dao = sqlSessionTemplate.getMapper(MemberDaoInter.class);
		Member member = dao.selectById(id);
		return member;

	}

	public void update(Member member,HttpServletRequest request) throws IllegalStateException, IOException {
		dao = sqlSessionTemplate.getMapper(MemberDaoInter.class);
		String uploadURI = "/uploadfile/memberphoto";
		String dir = request.getSession().getServletContext().getRealPath(uploadURI);
		System.out.println(dir);

		// 업로드 파일의 물리적 저장
		// 파일 저장 : 증명사진.jpg
		// 회원의 사진은 하나만 존재한다.
		// 파일 이름 생성 : 회원아이디_원본파일이름
		if (!member.getPhotofile().isEmpty()) {
			// 새로운 파일 이름 생성 -> 파일 저장 -> DB에 저장할 파일이름 set
			String fileName = member.getMember_id() + "_" + member.getPhotofile().getOriginalFilename();
			member.getPhotofile().transferTo(new File(dir, fileName));
			member.setPhoto(fileName);
		}
		dao.update(member);
	}
	public int delete(String id) {
		dao=sqlSessionTemplate.getMapper(MemberDaoInter.class);
		return dao.delete(id);
	}

}
