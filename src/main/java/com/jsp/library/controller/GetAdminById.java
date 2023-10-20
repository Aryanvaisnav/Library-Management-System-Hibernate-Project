package com.jsp.library.controller;

import com.jsp.library.dto.Admin;
import com.jsp.library.service.AdminService;

public class GetAdminById {

	public static void main(String[] args) {
		
		AdminService adminService = new AdminService();
		int id = 3;
		
		Admin admin = adminService.getAdminDetailsById(id);
		
		if(admin == null) {
			System.out.println("This record is deleted or does not exist");
		}
		else {
			System.out.println(admin.getId());
			System.out.println(admin.getName());
			System.out.println(admin.getEmail());
			System.out.println(admin.getPassword());
		}

	}

}
