package com.jsp.library.controller;

import com.jsp.library.service.AdminService;

public class UpdateAdminName {

	public static void main(String[] args) {
		
		AdminService adminService = new AdminService();
		String new_name = "XYZ";
		int id = 5;
		
		
		if(adminService.updateAdminNameById(id, new_name) == true) {
			System.out.println("Name is Updated");
		}
		else {
			System.out.println("Not Updated");
		}
		
		

	}

}
