package com.jsp.library.controller;

import com.jsp.library.dto.Book;
import com.jsp.library.service.LibrarianService;

public class AddBook {

	public static void main(String[] args) {
		
		LibrarianService librarianService = new LibrarianService();
		Book book = new Book();
		book.setName("Tarzan");
		book.setStatus("Available");
		
		librarianService.addBook(book);

	}

}
