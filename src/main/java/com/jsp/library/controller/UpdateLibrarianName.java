package com.jsp.library.controller;

import com.jsp.library.service.LibrarianService;

public class UpdateLibrarianName {

	public static void main(String[] args) {
		
		LibrarianService librarianService = new LibrarianService();
		String new_name = "XYZ";
		int id = 5;
		
		
		if(librarianService.updateLibrarianNameById(id, new_name) == true) {
			System.out.println("Name is Updated");
		}
		else {
			System.out.println("Not Updated");
		}
		
		

	}

}
