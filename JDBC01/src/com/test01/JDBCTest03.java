package com.test01;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest03 {
	//insert - MYTEST table
	public static void main(String[] args) throws SQLException {
		//준비
		Connection con = null;
		Statement stmt = null;
		
		// 키보드로 입력받아 MYTEST 테이블에 insert 실행
		Scanner sc = new Scanner(System.in);
		System.out.println("번호 입력: ");
		int no = sc.nextInt();
		System.out.println("이름 입력: ");
		String name = sc.next();
		System.out.println("별명 입력: ");
		String nickName = sc.next();
		
		String sql = " INSERT INTO MYTEST VALUES("+no+", '"+name+"', '"+nickName+"')" ;
		
		con = getConnection();
		stmt = con.createStatement();
		int res = stmt.executeUpdate(sql);
		
		if(res>0) {
			System.out.println("insert 성공");
		}else {
			System.out.println("insert 실패");
		}
		
		Close(stmt);
		Close(con);
	}

}
