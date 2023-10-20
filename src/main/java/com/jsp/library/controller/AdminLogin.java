package com.jsp.library.controller;

import com.jsp.library.service.AdminService;

public class AdminLogin {

	public static void main(String[] args) {
		AdminService adminService = new AdminService();
		int id = 1;
		String name = "Ben";
		String email = "ben@mail.com";
		String password = "ben10";
		
		if(adminService.adminLogin(id, name, email, password) == true) {
			System.out.println("Login Successfully");
		}
		else {
			System.out.println("You have entered the wrong credentials");
		}

	}

}
