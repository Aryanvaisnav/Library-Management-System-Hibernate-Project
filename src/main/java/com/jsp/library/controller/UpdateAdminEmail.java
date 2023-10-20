package com.jsp.library.controller;

import com.jsp.library.service.AdminService;

public class UpdateAdminEmail {

	public static void main(String[] args) {
		AdminService adminService = new AdminService();
		int id = 6;
		String new_email = "abc@mail.com";
		
		if(adminService.updateAdminEmailById(id, new_email) == true) {
			System.out.println("Email is Updated");
		}
		else {
			System.out.println("Not Updated");
		}

	}

}
