package com.studentManagement.StudentManagement.entities;

public class Student {
  int rollno;
  String name;
  int age;
  long dob;
  String address;
  long phone;
  String email;
  int class_x;
  int class_xii;
  long aadhar;
  String course;
  String branch;
  String password;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int rollno, String name, int age, long dob, String address, long phone, String email, int class_x,
		int class_xii, long aadhar, String course, String branch, String password) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.age = age;
	this.dob = dob;
	this.address = address;
	this.phone = phone;
	this.email = email;
	this.class_x = class_x;
	this.class_xii = class_xii;
	this.aadhar = aadhar;
	this.course = course;
	this.branch = branch;
	this.password = password;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getDob() {
	return dob;
}
public void setDob(long dob) {
	this.dob = dob;
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
public int getClass_x() {
	return class_x;
}
public void setClass_x(int class_x) {
	this.class_x = class_x;
}
public int getClass_xii() {
	return class_xii;
}
public void setClass_xii(int class_xii) {
	this.class_xii = class_xii;
}
public long getAadhar() {
	return aadhar;
}
public void setAadhar(long aadhar) {
	this.aadhar = aadhar;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
  
}
