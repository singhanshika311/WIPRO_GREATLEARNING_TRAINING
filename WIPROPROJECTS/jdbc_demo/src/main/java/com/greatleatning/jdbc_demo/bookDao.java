package com.greatleatning.jdbc_demo;

import java.sql.ResultSet;

import java.sql.Statement;



public class bookDao {

	public void getBooks(Statement stmt) throws Exception {
		// TODO Auto-generated method stub
		String str="select sname from student";
		ResultSet rs=stmt.executeQuery(str);
		int rowcounter=0;
		while(rs.next()) {
			String name=rs.getString("sname");
			System.out.println("the data: ");
			System.out.println(name);
			++rowcounter;
	
			
		}
		
		
	}

}
