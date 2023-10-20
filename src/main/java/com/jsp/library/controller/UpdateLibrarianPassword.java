package com.jsp.library.controller;

import com.jsp.library.service.LibrarianService;

public class UpdateLibrarianPassword {

	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		int id = 6;
		String password = "abc@123";
		
		if(librarianService.updateLibrarianPasswordById(id, password) == true) {
			System.out.println("Password is updated");
		}
		else {
			System.out.println("Not Updated");
		}

	}

}
