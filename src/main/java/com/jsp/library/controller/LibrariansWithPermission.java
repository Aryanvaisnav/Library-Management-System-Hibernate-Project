package com.jsp.library.controller;

import com.jsp.library.dto.Librarian;
import com.jsp.library.service.AdminService;

public class LibrariansWithPermission {

	public static void main(String[] args) {
		
		AdminService adminService = new AdminService();
		Librarian librarian = adminService.permitGranted(1, 2);
		if(librarian != null) {
			System.out.println("Status Updated");
		}
		else {
			System.out.println("Librarian or admin not found");
		}
		

	}

}
