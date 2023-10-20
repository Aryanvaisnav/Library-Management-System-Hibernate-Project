package com.jsp.library.controller;

import com.jsp.library.service.LibrarianService;

public class RemoveBook {

	public static void main(String[] args) {
		
		LibrarianService librarianService = new LibrarianService();
		int id = 7;
		if(librarianService.removeBookById(id) == true) {
			System.out.println("Deleted");
		}
		else {
			System.out.println("Not Deleted");
		}

	}

}
