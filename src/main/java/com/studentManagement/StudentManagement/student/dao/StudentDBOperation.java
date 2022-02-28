package com.studentManagement.StudentManagement.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDBOperation {

	DBconnection ob=new DBconnection();
	Connection conn=ob.connection();

	public boolean login(int rollno,String password) throws SQLException
	{
		
		
		PreparedStatement stmt=conn.prepareStatement("select * from student where rollno=? and password=? ");
		stmt.setInt(1, rollno);
		stmt.setString(2, password);
		
		ResultSet result=stmt.executeQuery();
		if(result.next()) //true or false
		{
		return true;
		}
		else
		{
			return false;
		}
	}
	
//logout
	public void logout() throws SQLException
	{
		conn.close();
		
	}
	//View Attendance
		synchronized public ResultSet viewAttendance(int rollno)
		   {
			   ResultSet rs=null;
			   try
			   {
			   PreparedStatement pr=conn.prepareStatement("select * from attendance_student where rollno=? ");
			   pr.setLong(1, rollno);
			   rs=pr.executeQuery();
			   }
			   catch(Exception e)
			   {
				   System.out.println("something went wrong!!!");
			   }
			   return rs;
		   }
		synchronized public ResultSet viewProfile(int rollno)
		   {
			   ResultSet rs=null;
			   try
			   {
			   PreparedStatement pr=conn.prepareStatement("select * from student where rollno=? ");
			   pr.setLong(1, rollno);
			   rs=pr.executeQuery();
			   }
			   catch(Exception e)
			   {
				   System.out.println("something went wrong!!!");
			   }
			   return rs;
		   }
}
