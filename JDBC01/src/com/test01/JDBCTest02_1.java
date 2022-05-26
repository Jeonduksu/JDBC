package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest02_1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//준비
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = " SELECT * FROM DEPARTMENT ";
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/multi";
		String id = "root";
		String pw = "1234";
		
		// 1. Driver 등록
		Class.forName(driver);
		// 2. Driver 연결
		con = DriverManager.getConnection(url,id,pw);
		// 3.
		stmt = con.createStatement();
		// 4.
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString(1) + " : " + rs.getString(2)
			+ " : " + rs.getString("LOCATION_ID"));
		}
		
		//5.
		rs.close();
		stmt.close();
		con.close();
		
		
	}

}
