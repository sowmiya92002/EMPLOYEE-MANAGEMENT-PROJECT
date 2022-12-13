package com.example.employeemanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class Admin {

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column
	
	//@Email(message="Email  is not valid!")
	private String emailId;
	
	@Column
	
	//@Size(min=8, message="Password length must be 8 and contain uppercase,lowercase,digits")
	
	private String password;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [emailId=" + emailId + ", password=" + password + "]";
	}

 

}

