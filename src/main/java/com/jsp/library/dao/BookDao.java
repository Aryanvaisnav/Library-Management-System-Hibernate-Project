package com.jsp.library.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.library.dto.Book;

public class BookDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryan");
	
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
//==============================================================================================================
	
	// Insert the book details
	
	public Book addBook(Book book) {
		entityTransaction.begin();
		entityManager.persist(book);
		entityTransaction.commit();
		return book;
	}
	
//===============================================================================================================
	
	// Delete the book details by id
	
	public boolean removeBookById(int id) {
		Book book = entityManager.find(Book.class, id);
		entityTransaction.begin();
		entityManager.remove(book);
		entityTransaction.commit();
		return true;
	}
	
		
//=======================================================================================================================
	
	// Get the details of book by id
	
	public Book getBookDetailsById(int id) {
		Book book = entityManager.find(Book.class, id);
		return book;
	}
	
//======================================================================================================================
	
	// Get the details of all books
	
	public List<Book> getAllBooks() {
		String sql = "Select b from Book b";
		Query query = entityManager.createQuery(sql);
		List<Book> book = query.getResultList();
		return book;
	}
	
//======================================================================================================================

	// Issue a Book
	
	public Book issueBook(Book book) {
		entityTransaction.begin();
		entityManager.merge(book);
		entityTransaction.commit();
		return book;
	}
	
//=======================================================================================================================
	
	// Return a Book
	
	public Book returnBook(Book book) {
		entityTransaction.begin();
		entityManager.merge(book);
		entityTransaction.commit();
		return book;
	}

//========================================================================================================================
	
}
