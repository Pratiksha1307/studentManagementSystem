package com.studentManagement.StudentManagement.entities;

public class Teacher {
  String name;
  String address;
  long phone;
  String email;
  String course;
  int emp_id;
  String password;
public Teacher() {
	super();
	// TODO Auto-generated constructor stub
}
public Teacher(String name, String address, long phone, String email, String course, int emp_id, String password) {
	super();
	this.name = name;
	this.address = address;
	this.phone = phone;
	this.email = email;
	this.course = course;
	this.emp_id = emp_id;
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
  
}
