package com.jsp.library.controller;

import com.jsp.library.service.LibrarianService;

public class UpdateLibrarianEmail {

	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		int id = 6;
		String new_email = "abc@mail.com";
		
		if(librarianService.updateLibrarianEmailById(id, new_email) == true) {
			System.out.println("Email is Updated");
		}
		else {
			System.out.println("Not Updated");
		}

	}

}
