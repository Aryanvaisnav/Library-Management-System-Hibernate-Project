package com.jsp.library.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.library.dto.Librarian;

public class LibrarianDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryan");
	
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	// Insert the Librarian details
	
	public Librarian saveLibrarian(Librarian librarian) {
		entityTransaction.begin();
		entityManager.persist(librarian);
		entityTransaction.commit();
		return librarian;
	}
	
//=======================================================================================
	
	
	// Delete the Librarian by id
	
	public boolean deleteLibrarianById(int id) {
		Librarian librarian = entityManager.find(Librarian.class, id);
		entityTransaction.begin();
		entityManager.remove(librarian);
		entityTransaction.commit();
		return true;
	}
	
//=========================================================================================
	
	// Update the Librarian name by id
	
	public boolean updateLibrarianNameById(int id, String new_name) {
		Librarian librarian = entityManager.find(Librarian.class, id);
		librarian.setName(new_name);
		entityTransaction.begin();
		entityManager.merge(librarian);
		entityTransaction.commit();
		return true;
	}
	
//========================================================================================
	
	// Update the Librarian email by id
	
	public boolean updateLibrarianEmailById(int id, String new_email) {
		Librarian librarian = entityManager.find(Librarian.class, id);
		librarian.setEmail(new_email);
		entityTransaction.begin();
		entityManager.merge(librarian);
		entityTransaction.commit();
		return true;	
	}
	
//===========================================================================================
	
	// Update the Librarian password by id
	
	public boolean updateLibrarianPasswordById(int id, String new_password) {
		Librarian librarian = entityManager.find(Librarian.class, id);
		librarian.setPassword(new_password);
		entityTransaction.begin();
		entityManager.merge(librarian);
		entityTransaction.commit();
		return true;
	}
	
//===========================================================================================
	
	// Get the Librarian details by id
	
	public Librarian getLibrarianDetailsById(int id) {
		Librarian librarian = entityManager.find(Librarian.class, id);
		return librarian;
	}

//=============================================================================================
	
	// Get all librarian details by id
	
	public List<Librarian> getAllLibrarians() {
		String sql = "Select l from Librarian l";
		Query query = entityManager.createQuery(sql);
		
		List<Librarian> librarian = query.getResultList();
		return librarian;
	}
	
//===============================================================================================
	
	// Permission
	
	public Librarian permit(Librarian librarian) {
		entityTransaction.begin();
		entityManager.persist(librarian);
		entityTransaction.commit();
		return librarian;
	}
	
//===================================================================================================

}
