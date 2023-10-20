package com.jsp.library.controller;

import com.jsp.library.service.LibrarianService;

public class StudentRequest {

	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		String book_requested = "Harry Potter";
		
		//  librarianService.requestedBookAccepted(2, book_requested);
		
		if(librarianService.requestedBookAccepted(2, book_requested) != null) {
			System.out.println("Student Request is Updated");
		}
		else {
			System.out.println("Student Request is not updated");
		}

	}

}
