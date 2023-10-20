package com.jsp.library.controller;

import com.jsp.library.service.AdminService;

public class UpdateAdminPassword {

	public static void main(String[] args) {
		AdminService adminService = new AdminService();
		int id = 6;
		String password = "abc@123";
		
		if(adminService.updateAdminPasswordById(id, password) == true) {
			System.out.println("Password is updated");
		}
		else {
			System.out.println("Not Updated");
		}

	}

}
