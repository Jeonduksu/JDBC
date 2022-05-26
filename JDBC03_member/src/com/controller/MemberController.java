package com.controller;

import java.util.List;

import com.model.dto.Member;
import com.model.service.MemberBiz;
import com.model.service.MemberBizImpl;

public class MemberController {
	MemberBiz biz = new MemberBizImpl();
	
	public List<Member> selectAll() {
		//List<Member> res = mb.selectAll();
		return biz.selectAll();
	}
	public Member selectOne(int no) {
		return biz.selectOne(no	);
	}
	public int insert(Member m) {
		//int res = biz.insert(m);
		return biz.insert(m);
	}
	public int delete(int no) {
		return biz.delete(no);
	}
	public int update(Member m) {
		return biz.update(m);
	}
	
	
	
	
	
	
}
