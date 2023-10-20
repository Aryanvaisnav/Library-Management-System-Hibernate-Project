package com.jsp.library.controller;

import com.jsp.library.dto.Book;
import com.jsp.library.service.BookService;

public class GetBookById {

	public static void main(String[] args) {
		
		BookService bookService = new BookService();
		int id = 3;
		Book book = bookService.getBookDetailsById(id);
		if(book != null) {
			System.out.println(book.getId());
			System.out.println(book.getName());
			System.out.println(book.getStatus());
		}
		else {
			System.out.println("This record is deleted or does not exist");
		}

	}

}
