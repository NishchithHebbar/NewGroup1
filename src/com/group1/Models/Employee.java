package com.group1.Models;

public abstract class Employee {

	String userName;
	String password;
	String firstName;
	String lastName;
	String role;
	int employeeId;
	int loginAttempts;
	
	abstract boolean changePassword(String passWord);
	
}
