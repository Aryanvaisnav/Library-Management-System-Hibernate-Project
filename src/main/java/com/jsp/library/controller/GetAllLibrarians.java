package com.jsp.library.controller;

import java.util.List;

import com.jsp.library.dto.Librarian;
import com.jsp.library.service.LibrarianService;

public class GetAllLibrarians {

	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		List<Librarian> librarian = librarianService.getAllLibrarians();
		
		for(Librarian lib : librarian) {
			System.out.println(lib.getId());
			System.out.println(lib.getName());
			System.out.println(lib.getEmail());
			System.out.println(lib.getPassword());
			System.out.println(lib.getStatus());
			System.out.println("=========================================");
		}
		

	}

}
