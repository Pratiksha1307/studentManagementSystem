package com.studentManagement.StudentManagement.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import com.studentManagement.StudentManagement.entities.Student;



public class TeacherDBOperation {
	DBconnection ob=new DBconnection();
	Connection conn=ob.connection();

	public boolean login(long emp_id,String password) throws SQLException
	{
		
		
		PreparedStatement stmt=conn.prepareStatement("select * from teacher where emp_id=? and password=? ");
		stmt.setLong(1, emp_id);
		stmt.setString(2, password);
		
		ResultSet result=stmt.executeQuery();
		if(result.next())
		{
		return true;
		}
		else
		{
			return false;
		}
	}
	//Add Student
	synchronized public boolean addStudent(Student e) throws SQLException
	{
		PreparedStatement stmt=conn.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
		stmt.setInt(1, e.getRollno());
		stmt.setString(2,e.getName());
		stmt.setInt(3,e.getAge());
		stmt.setLong(4,e.getDob());
		stmt.setString(5,e.getAddress());
		stmt.setDouble(6,e.getPhone());
		stmt.setString(7,e.getEmail());
		stmt.setInt(8, e.getClass_x());
		stmt.setInt(9, e.getClass_xii());
		stmt.setLong(10,e.getAadhar());
		stmt.setString(11,e.getCourse());
		stmt.setString(12,e.getBranch());
		stmt.setString(13,e.getPassword());
		
		
		int affectedRows=stmt.executeUpdate();
		if(affectedRows>0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	//Delete Student
	public boolean deleteStudent(int rollno) throws SQLException
	{
		PreparedStatement stmt=conn.prepareStatement("delete from student where rollno=?");
		stmt.setLong(1, rollno);
		
		int affectedRows=stmt.executeUpdate();
		if(affectedRows>0)
		{
		return true;
		}
		else
		{
			return false;
		}
	}
	
	//Update Student
	public boolean updateStudent(int rollno, String name, int age, long dob, String address, long phone, String email, int class_x,
			int class_xii, long aadhar, String course, String branch, String password) throws SQLException
	{
		
		PreparedStatement stmt=conn.prepareStatement("update student set name=?,age=?,dob=?,address=?,phone=?,email=?,class_x=?,class_xii=?,aadhar=?,course=?,branch=?,password=? where rollno=? ");
		
		stmt.setString(1,name);
		stmt.setLong(2, age);
		stmt.setLong(3,dob);
		stmt.setString(4,address);
		stmt.setLong(5,phone);
		stmt.setString(6,email);
		stmt.setInt(7,class_x);
		stmt.setInt(8,class_xii);
		stmt.setLong(9,aadhar);
		stmt.setString(10,course);
		stmt.setString(11,branch);
		stmt.setString(12,password);
		stmt.setInt(13,rollno);
		
		int affectedRows=stmt.executeUpdate();
	//	System.out.println(affectedRows);
		
		if(affectedRows>0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	//Add Attendance
	synchronized public boolean addAttendance(int rollno,String attendance) throws SQLException
	{
		//genreate transcation date
		 Date d=new Date(); //java.util
        // java.sql type
		Timestamp tdate=new Timestamp(d.getTime());
		
		PreparedStatement stmt=conn.prepareStatement("insert into attendance_student values(?,?,?)");
		stmt.setInt(1,rollno);
		stmt.setTimestamp(2,tdate);
		stmt.setString(3,attendance);
				
		int affectedRows=stmt.executeUpdate();
		if(affectedRows>0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
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
	//view All Students
	public void viewAllStudent() throws SQLException
	{
		PreparedStatement stmt=conn.prepareStatement("select * from student");
		ResultSet result=stmt.executeQuery();
		while(result.next())
		{
		  int rollno=result.getInt(1);
		  String name= result.getString(2);
		  int age= result.getInt(3);
		  Date dob= result.getDate(4);
		  String address=result.getString(5);
		  long phone=result.getLong(6);
		  String email=result.getString(7);
		  int class_x=result.getInt(8);
		  int class_xii=result.getInt(9);
		  long aadhar= result.getLong(10);
		  String course=result.getString(11);
		  String branch= result.getString(12);
		  String password= result.getString(13); 
		    
		   System.out.println("roll no:"+rollno+"\n name :"+name+"\n date of birth:"+dob+"\n Address  :"+address+"\n Phone no :"+phone+"\n Email :"+email+"\n Class X(%):"+class_x+"\n Class XII(%):"+class_xii+"\n Aadhar No:"+aadhar+"\n Course:"+course+"\n Branch:"+branch+"\n Password:"+password);
		   System.out.println("======================xxxxxxxxxx======================================================");
		}
	
		
	}
	//log out
	public void logout() throws SQLException
	{
		conn.close();
		
	}
}
