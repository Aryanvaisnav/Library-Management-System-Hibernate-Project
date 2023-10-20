package com.jsp.library.service;

import java.util.List;

import com.jsp.library.dao.BookDao;
import com.jsp.library.dto.Book;

public class BookService {
	
	BookDao bookDao = new BookDao();
	
	
//===========================================================================================================
	
	public Book getBookDetailsById(int id) {
		Book book = bookDao.getBookDetailsById(id);
		if(book != null) {
			return bookDao.getBookDetailsById(id);
		}
		else {
			return null;
		}
	}
	
//=============================================================================================================
	
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}
	
//=============================================================================================================

}
