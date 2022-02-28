package com.studentManagement.StudentManagement.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	public Connection connection()
	{
		Connection conn=null;	
		String databaseUrl="jdbc:mysql://localhost:3306/studentmanagement";
		String userName="root";
		String userPassword="";
		
		
			try {
				conn=DriverManager.getConnection(databaseUrl, userName, userPassword);
				
			} 
			catch (SQLException e) 
			{
				
				e.printStackTrace();  //
			}
			
		return conn;
	}
}
