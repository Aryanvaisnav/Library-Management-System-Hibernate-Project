package com.jsp.library.controller;

import com.jsp.library.service.LibrarianService;

public class DeleteLibrarian {

	public static void main(String[] args) {
		
		LibrarianService librarianService = new LibrarianService();
		int id = 3;
		
		if(librarianService.deleteLibrarianById(id) == true) {
			System.out.println("Deleted");
		}
		else {
			System.out.println("Not Deleted");
		}
		

	}

}

