package com.studentManagement.StudentManagement;

import java.sql.ResultSet;
import java.util.Date;
import java.util.Scanner;

import com.studentManagement.StudentManagement.entities.Student;
import com.studentManagement.StudentManagement.student.dao.StudentDBOperation;
import com.studentManagement.StudentManagement.student.dao.TeacherDBOperation;

public class App 
{
    public static void main( String[] args )
 
      {
    	    	System.out.println(".......................xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx..........................................................");
    	    	System.out.println("                             WELCOME TO STUDENT MANEGAMENT SYSTEM                                ");
    	    	System.out.println(".......................xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx............................................................");
    	    	
    	    	boolean status=true;
    	    	do
    	    	{
    	       try
    	       {
    	    	Scanner scan=new Scanner(System.in);
    	    	System.out.println(".......................................................................................................................................");
    	    	System.out.println("\t press 1-> Teacher");
    	    	System.out.println("\t press 2-> Student");
    	    	System.out.println(".......................................................................................................................................");
    	    	int userType=scan.nextInt();
    	    	TeacherDBOperation bo=new TeacherDBOperation();
    	    	
    	    	if(userType==1)
    	    	{
    	    		System.out.println("\t Enter Teacher Id:");
    	    		long eId=scan.nextLong();
    	    		System.out.println("\t Enter Password:");
    	    		String pswd=scan.next();
    	    		boolean validUser=bo.login(eId, pswd);
    	    		if(validUser)
    	    		{
    	    			System.out.println(".........................**********************************.............................................................................................");
    	    			System.out.println("                             login successfull!!                          ");
    	    			System.out.println(".........................*********************************..............................................................................................");
    	    			System.out.println("\t 1.Add Student\r\n" 
    	    	       		            	+ "2.Delete Student\r\n"
    	    	       		             	+ "3.Update Student\r\n"
    	    	       		            	+ "4.Add Attendance\r\n"
    	    	       		            	+ "5.View Attendance\r\n"
    	    	       		            	+ "6.View All Students\r\n"
    	    	       		            	+ "7.log out\r\n");
    	    		//for closing	
    	    	    	int operation=scan.nextInt();
    	    			if(operation==1)
    	    			{
    	    				
    	    				System.out.println("......................*******************************************...................................................................................");
    						System.out.println("                          Add Student or Student Admition !!                       ");
    						System.out.println("......................********************************************.................................................................................");
    	    				
    	    				System.out.println("Enter Roll number of student:");
    	    				int rollno=scan.nextInt();
    	    				System.out.println("Enter Student name:");
    	    				String name=scan.next();
    	    				System.out.println("Enter Student age:");
    	    				int age=scan.nextInt();
    	    				System.out.println("Enter Date of birth:");
    	    				long dob=scan.nextLong();
    	    				System.out.println("Enter Student Address:");
    	    				String address=scan.next();
    	    				System.out.println("Enter phone number:");
    	    				long phone=scan.nextLong();
    	    				System.out.println("Enter email address:");
    	    				String email=scan.next();
    	    				System.out.println("Enter Class_x marks:");
    	    				int class_x=scan.nextInt();
    	    				System.out.println("Enter Class_xii marks:");
    	    				int class_xii=scan.nextInt();
    	    				System.out.println("Enter Student aadhar no :");
    	    				long aadhar=scan.nextLong();
    	    				System.out.println("Enter Student course:");
    	    				String course=scan.next();
    	    				System.out.println("Enter Student branch:");
    	    				String branch=scan.next();
    	    				System.out.println("Enter Student password:");
    	    				String password=scan.next();
    	    				Student u=new Student(rollno,name,age,dob,address,phone,email,class_x,class_xii,aadhar,course,branch,password);
    	    				if(bo.addStudent(u))
    	    				{
    	    					System.out.println(".......................***************************************............................................................");
    	    					System.out.println("                              Addmition Successfully !!                       ");
    	    					System.out.println(".......................***************************************.............................................................");
    	    				}
    	    				else
    	    				{
    	    					System.out.println("......................***************************************.........................................................");
    	    					System.out.println("                              problem in taking admition                       ");
    	    					System.out.println("......................****************************************........................................................");
    	    				}
    	    				
    	    			}
    	    			else if(operation==2)
    	    			{
    	    				
    	    				System.out.println("Enter account Id for closing account:");
    	    				int rollno=scan.nextInt();
    	    				if(bo.deleteStudent(rollno))
    	    				{
    	    					System.out.println("...................***************************************........................................................");
    	    					System.out.println("                        Student Deleted Successfully!!                ");
    	    					System.out.println("...................***************************************........................................................");
    	    				}
    	    				else
    	    				{
    	    					System.out.println("....................******************************************.......................................................");
    	    					System.out.println("                         Problem in deleting student!!                ");
    	    					System.out.println("....................******************************************......................................................");
    	    				}

    	    			}
    	    			else if(operation==3)
    	    			{
    	    				System.out.println("Enter Roll number of student:");
    	    				int rollno=scan.nextInt();
    	    				System.out.println("Enter Student name:");
    	    				String name=scan.next();
    	    				System.out.println("Enter Student age:");
    	    				int age=scan.nextInt();
    	    				System.out.println("Enter Date of birth:");
    	    				long dob=scan.nextLong();
    	    				System.out.println("Enter Student Address:");
    	    				String address=scan.next();
    	    				System.out.println("Enter phone number:");
    	    				long phone=scan.nextLong();
    	    				System.out.println("Enter email address:");
    	    				String email=scan.next();
    	    				System.out.println("Enter Class_x marks:");
    	    				int class_x=scan.nextInt();
    	    				System.out.println("Enter Class_xii marks:");
    	    				int class_xii=scan.nextInt();
    	    				System.out.println("Enter Student aadhar no :");
    	    				long aadhar=scan.nextLong();
    	    				System.out.println("Enter Student course:");
    	    				String course=scan.next();
    	    				System.out.println("Enter Student branch:");
    	    				String branch=scan.next();
    	    				System.out.println("Enter Student password:");
    	    				String password=scan.next();
    	    				
    	    				if(bo.updateStudent(rollno,name,age,dob,address,phone,email,class_x,class_xii,aadhar,course,branch,password))
    	    				{
    	    					System.out.println("===========================*****************************************====================================================================================");
    	    					System.out.println("                              Student info Updated Succefully !!                       ");
    	    					System.out.println("===========================*****************************************======================================================================================");
    	    				}
    	    				else
    	    				{
    	    					System.out.println("=========================*******************************************========================================================================================");
    	    					System.out.println("                              Problem in updating info..                        ");
    	    					System.out.println("=========================*******************************************========================================================================================");
    	    				}
    	    			
    	    			}
    	    			
    	    			else if(operation==4)
    	    	       	{
    	    				System.out.println("Enter Roll number of student:");
    	    				int rollno=scan.nextInt();
    	    				System.out.println("Enter Date:");
    	    				String date=scan.next();
    	    				System.out.println("Enter Attendance Status");
    	    				String attendance=scan.next();
    	    				if(bo.addAttendance(rollno,attendance))
    	    				{
    	    					System.out.println("======================****************************************==================================================================");
    	    					System.out.println("                              Attendance Successfully !!                       ");
    	    					System.out.println("======================****************************************====================================================================================");
    	    				}
    	    				else
    	    				{
    	    					System.out.println("=======================*********************************************===================================================================================");
    	    					System.out.println("                              problem in Updating Attendance..                       ");
    	    					System.out.println("=======================*********************************************===================================================================================");
    	    				}
    	    				
    	    	        }
    	    			
    	    			else if(operation==5)
    	    	    	{
    	    				 System.out.println("Enter the Roll No :");
    	         	       	 int rollno=scan.nextInt();
    	    				 System.out.println("============================================================================================================");
    	    				 System.out.println("\t"+"Roll no "+"\t" +"Date and Time"+ "\t\t\t"+"Attendance Status");
    	    				 System.out.println("============================================================================================================");
    	    				
    	    				 ResultSet rs=bo.viewAttendance(rollno);
    	    				 while(rs.next())
    	    				 {
    	    				 System.out.println("\t"+rs.getInt(1)+"\t\t"+rs.getTimestamp(2)+"\t\t"+rs.getString(3));
    	    				 }
    	    				 System.out.println("=============================================================================================================");
    	    				 

    	    	    	}
    	    			else if(operation==6)
    	    	    	{
    	    				bo.viewAllStudent();
    	    	    	}
    	    			else if(operation==7)
    	    	       	{
    	    	       		bo.logout();
    	    	       		System.out.println("==========================**********************================================================================================================");
    	        			System.out.println("                               Logged Out!!                             ");
    	        	       	System.out.println("==========================**********************================================================================================================");

    	    	       	}
    	    			
    	    			
    	    		}
    	    		else
    	    		{
    	    			System.out.println("===========================***********************======================================================================================================");
    	    			System.out.println("                                  incorrect                                 ");
    	    			System.out.println("===========================**********************======================================================================================================");
    	    		}
    	    	}
    	    	else if(userType==2)
    	    	{
    	    		StudentDBOperation s=new StudentDBOperation();
    	    		System.out.println("\t Enter Student Roll Number:");
    	    		int rollno=scan.nextInt();
    	    		System.out.println("\t Enter Password:");
    	    		String password=scan.next();
    	    		
    	    		if(s.login(rollno, password))
    	    		{
    	    			System.out.println("========================***************************=========================================================================================================s");
    	    			System.out.println("                            Student logged in!!                                  ");
    	    			System.out.println("========================***************************=========================================================================================================");
    	    			
    	    			System.out.println("\t\n"
    	    					+ " 1.View Profile \r\n"
    	    	    			+ "2.View Attendance \r\n"
    	    	    			+"3.Logout");
    	    			int operation=scan.nextInt();
    	    			if(operation==1)
    	    			{
    	    				 System.out.println("Enter the Roll no:");
       	         	       	 int rollNo=scan.nextInt();
    	    				
    	    			
    	    				ResultSet result=s.viewProfile(rollNo);
    	    				while(result.next())
    	    				{
    	    				  int srollno=result.getInt(1);
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
    	    				  String spassword= result.getString(13); 
    	    				    
    	    				   System.out.println("roll no:"+srollno+"\n name :"+name+"\n date of birth:"+dob+"\n Address  :"+address+"\n Phone no :"+phone+"\n Email :"+email+"\n Class X(%):"+class_x+"\n Class XII(%):"+class_xii+"\n Aadhar No:"+aadhar+"\n Course:"+course+"\n Branch:"+branch+"\n Password:"+spassword);
    	    				   System.out.println("======================xxxxxxxxxx======================================================");
    	    				}
    	    			}
    	    			else if(operation==2)  //View Attendance
    	    			{
    	    			 System.out.println("Enter the Roll number of student:");
   	         	       	 int rollNo=scan.nextInt();
   	    				 System.out.println("============================================================================================================");
   	    				 System.out.println("\t"+"Roll no "+"\t" +"Date and Time"+ "\t\t\t"+"Attendance Status");
   	    				 System.out.println("============================================================================================================");
   	    				
   	    				 ResultSet rs=bo.viewAttendance(rollNo);
   	    				 while(rs.next())
   	    				 {
   	    				 System.out.println("\t"+rs.getInt(1)+"\t\t"+rs.getTimestamp(2)+"\t\t"+rs.getString(3));
   	    				 }
   	    				 System.out.println("=============================================================================================================");
    	    		    }
    	    			else if(operation==3)
    	    			{
    	    				s.logout();
    	    	       		status=false;
    	    	       		System.out.println("=============================================================================================================");
    	        			System.out.println("                                      Logged Out!!                     ");
    	        	       	System.out.println("==============================================================================================================");
    	    			}
    	    			else 
    	    	       	{
    	    	    		System.out.println("============================================================================================================");
    	        			System.out.println("                           Wrong Input!!                               ");
    	        	       	System.out.println("=============================================================================================================");

    	    	       	}
    	    	       	

    	    		}
    	    		else
    	    		{
    	    			System.out.println("===================================================================================================================");
    	    			System.out.println("                     Roll No  or Password Incorrect!!!                       ");
    	    			System.out.println("====================================================================================================================");

    	    		}
    	    	}
    	    	else
    	    	{
    	    	   System.out.println("\t Please enter a correct input!!");
    	    	}
    	       
    	     }
    	       catch(Exception e)
    	       {
    	    	   System.out.println(e.getMessage());
    	    	   System.out.println("\t Wrong Input!!");
    	    	   System.out.println("\t Provide Number Input!!");
    	    	   System.out.println("======================================================================================================================================");
    	       }
    	    }
    	    	while(status);
    	    }
    	

    }

