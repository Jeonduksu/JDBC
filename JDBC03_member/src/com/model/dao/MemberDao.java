package com.model.dao;

import java.sql.Connection;
import java.util.List;

import com.model.dto.Member;

//인터페이스(상수필드,추상필드)
public interface MemberDao {
	//sql
	//쿼리문 
	public static final String selectAllSql = "SELECT * FROM MEMBER";
	public String selectOneSql = "SELECT * FROM MEMBER WHERE M_NO=?";
	public String insertSql = "INSERT INTO MEMBER VALUES(NULL,?,?,?,?,?,?,?)";
	public String deleteSql = "DELETE FROM MEMBER WHERE M_NO=?";
	public String updateSql = "UPDATE MEMBER SET M_NAME=? ,M_AGE=? ,M_GENDER=? ,M_TEL=? WHERE M_NO=?";
	
	
	public List<Member> selectAll(Connection con);
	public Member selectOne(Connection con,int no);
	public int insert(Connection con,Member m);
	public int delete(Connection con,int no);
	public int update(Connection con,Member m);
	
	
	
}
