package com.collections;

import java.util.Date;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
//	private String address;
	private Date joiningDate;
//	private Date DOB;
	private int workExperience;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}*/
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	/*public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}*/
	public int getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(int workExperience) {
		this.workExperience = workExperience;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(int eId,String eName,int age,Date joinDate,int workEx) {
		// TODO Auto-generated constructor stub
		this.id = eId;
		this.name = eName;
		this.age = age;
		this.joiningDate = joinDate;
		this.workExperience = workEx;
	}
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}
	
}
