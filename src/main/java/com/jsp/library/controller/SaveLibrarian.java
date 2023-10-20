package com.jsp.library.controller;

import com.jsp.library.dto.Librarian;
import com.jsp.library.service.LibrarianService;

public class SaveLibrarian {

	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		Librarian librarian = new Librarian();
		librarian.setName("Tyson");
		librarian.setEmail("tyson@mail.com");
		librarian.setPassword("tyson@123");
		librarian.setStatus("Authorized");
		
		librarianService.saveLibrarian(librarian);

	}

}

