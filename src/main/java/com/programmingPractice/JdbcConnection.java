package com.programmingPractice;

import java.sql.*;

public class JdbcConnection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from custodian");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Close the diver connection");
		}
		
		
		
		

	}

}
