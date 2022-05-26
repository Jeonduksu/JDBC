package com.test01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import static common.JDBCTemplate.*;

public class JDBCTest05 {
	//delete
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		PreparedStatement pstm = null;
		
		int no = 0;
		String sql = " DELETE FROM MYTEST WHERE MNO=?";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 번호 : ");
		no = sc.nextInt();
		
		//연결
		con = getConnection();
		
		//실행
		pstm = con.prepareStatement(sql);
		pstm.setInt(1, no);
		
		int res = pstm.executeUpdate();
		
		if(res>0) {
			System.out.println("연결성공");
		}else {
			System.out.println("연결실패");
		}
		
		Close(pstm);
		Close(con);
		sc.close();
		
		
		
		
		
		
		
		
		
		
	}
}
