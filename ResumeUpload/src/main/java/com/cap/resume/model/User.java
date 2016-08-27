package com.cap.resume.model;

public class User {
	
	private String userId;
	private String password;
	private String firstName;
	private String lastName;
	private String birthDate;
	private String salary;
	
	
	
	public User() {
		
	}
	public User(String userId, String password, String firstName, String lastName, String birthDate, String salary) {
		
		this.userId = userId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.salary = salary;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}


}
