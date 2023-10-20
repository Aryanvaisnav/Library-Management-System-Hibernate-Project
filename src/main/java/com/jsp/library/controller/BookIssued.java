package com.jsp.library.controller;

import com.jsp.library.dto.Book;
import com.jsp.library.service.LibrarianService;

public class BookIssued {

	public static void main(String[] args) {
		
		LibrarianService librarianService = new LibrarianService();
		Book book = librarianService.issueBook(6, 4, 3);
		
		if(book != null) {
			System.out.println("Updated");
		}
		else {
			System.out.println("Not Updated");
		}

	}

}
