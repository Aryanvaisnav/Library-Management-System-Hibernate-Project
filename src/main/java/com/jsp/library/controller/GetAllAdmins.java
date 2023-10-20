package com.jsp.library.controller;

import java.util.List;

import com.jsp.library.dto.Admin;
import com.jsp.library.service.AdminService;

public class GetAllAdmins {

	public static void main(String[] args) {
		AdminService adminService = new AdminService();
		List<Admin> admin = adminService.getAllAdmins();
		
		for(Admin a : admin) {
			System.out.println(a.getId());
			System.out.println(a.getName());
			System.out.println(a.getEmail());
			System.out.println(a.getPassword());
			System.out.println("=========================================");
		}
		

	}

}
