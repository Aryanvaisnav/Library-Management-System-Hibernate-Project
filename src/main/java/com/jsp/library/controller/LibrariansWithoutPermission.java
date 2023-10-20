package com.jsp.library.controller;

import com.jsp.library.dto.Librarian;
import com.jsp.library.service.AdminService;

public class LibrariansWithoutPermission {

	public static void main(String[] args) {
		
		AdminService adminService = new AdminService();
		Librarian librarian = adminService.permitNotGranted(2, 3);
		if(librarian != null) {
			System.out.println("Status Updated");
		}
		else {
			System.out.println("Librarian or admin not found");
		}
		

	}

}


