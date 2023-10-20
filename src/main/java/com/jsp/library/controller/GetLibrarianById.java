package com.jsp.library.controller;

import com.jsp.library.dto.Librarian;
import com.jsp.library.service.LibrarianService;

public class GetLibrarianById {

	public static void main(String[] args) {
		
		LibrarianService librarianService = new LibrarianService();
		int id = 3;
		
		Librarian librarian = librarianService.getLibrarianDetailsById(id);
		
		if(librarian == null) {
			System.out.println("This record is deleted or does not exist");
		}
		else {
			System.out.println(librarian.getId());
			System.out.println(librarian.getName());
			System.out.println(librarian.getEmail());
			System.out.println(librarian.getPassword());
			System.out.println(librarian.getStatus());
		}

	}

}
