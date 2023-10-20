package com.jsp.library.controller;

import com.jsp.library.service.AdminService;

public class DeleteAdmin {

	public static void main(String[] args) {
		
		AdminService adminService = new AdminService();
		int id = 3;
		
		if(adminService.deleteAdminById(id) == true) {
			System.out.println("Deleted");
		}
		else {
			System.out.println("Not Deleted");
		}
		

	}

}
