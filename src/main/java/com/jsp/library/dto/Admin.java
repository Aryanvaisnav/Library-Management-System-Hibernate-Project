package com.jsp.library.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String password;
	
	// Id
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	// Name
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Email
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// Password
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	


}
