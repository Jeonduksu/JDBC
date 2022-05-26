package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.Driver 등록
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2. DBMS 연결
		String url = "jdbc:mysql://localhost/multi";
		String user = "root";
		String pw = "1234";
		
		Connection con = DriverManager.getConnection(url,user,pw);
		
		// 3. 쿼리 준비
		String sql = " SELECT * FROM EMPLOYEE ";
		
		Statement stmt = con.createStatement();
		
		// 4. 쿼리 실행 및 결과 리턴
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" " + rs.getString(2)+ " " + rs.getInt("SALARY")); 
		}
		
		
		// 5. db 종료
		rs.close();
		stmt.close();
		con.close();
		
		
		
		
		
		
		
		
		
	}

}
