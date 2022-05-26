package com.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import com.model.dao.MemberDao;
import com.model.dao.MemberDaoImpl;
import com.model.dto.Member;
public class MemberBizImpl implements MemberBiz{
	MemberDao dao = new MemberDaoImpl();
	
	@Override
	public List<Member> selectAll() {
		Connection con = getConnection();
		List<Member> res = dao.selectAll(con);
		Close(con);
		return res;
	}

	@Override
	public Member selectOne(int no) {
		//커낵션 객체를 만들어 준다
		Connection con = getConnection();
		
		Member res = dao.selectOne(con, no);
		
		Close(con);	
		return res;
	}

	@Override
	public int insert(Member m) {
		Connection con = getConnection();
		
		int res = dao.insert(con, m);
		
		if(res>0) {
			Commit(con);
		}else {
			Rollback(con);
		}
		Close(con);
		
		return res;
	}

	@Override
	public int delete(int no) {
		Connection con = getConnection();
		
		int res = dao.delete(con, no);
		if(res>0) {
			Commit(con);
		}
		return res;
	}

	@Override
	public int update(Member m) {
		Connection con = getConnection();
		
		int res = dao.update(con, m);
		
		if(res>0) {
			Commit(con);
		}else {
			Rollback(con);
		}
		Close(con);
		return res;
	}

}
