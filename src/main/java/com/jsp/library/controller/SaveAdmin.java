package com.jsp.library.controller;

import com.jsp.library.dto.Admin;
import com.jsp.library.service.AdminService;

public class SaveAdmin {

	public static void main(String[] args) {
		AdminService adminService = new AdminService();
		Admin admin = new Admin();
		admin.setName("Max");
		admin.setEmail("max@mail.com");
		admin.setPassword("maxtennyson7777");
		
		adminService.saveAdmin(admin);

	}

}
