package com.jsp.library.controller;

import java.util.List;

import com.jsp.library.dto.Librarian;
import com.jsp.library.service.AdminService;

public class AllUnauthorizedLibrarians {

	public static void main(String[] args) {
		
		AdminService adminService = new AdminService();
		List<Librarian> librarians = adminService.getAllUnauthorizedLibrarians();
		
		if(librarians != null) {
			for(Librarian l : librarians) {
				System.out.println(l.getId());
				System.out.println(l.getName());
				System.out.println(l.getEmail());
				System.out.println(l.getPassword());
				System.out.println(l.getStatus());
				System.out.println("=======================================================================");
			}
		}
		else {
			System.out.println("No UnAuthorized Librarians");
		}

	}

}
