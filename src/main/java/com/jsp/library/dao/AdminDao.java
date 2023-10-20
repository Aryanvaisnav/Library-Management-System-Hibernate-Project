package com.jsp.library.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.library.dto.Admin;

public class AdminDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryan");
	
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	// Insert the Admin details
	
	public Admin saveAdmin(Admin admin) {
		entityTransaction.begin();
		entityManager.persist(admin);
		entityTransaction.commit();
		return admin;
	}
	
//=======================================================================================
	
	
	// Delete the Admin by id
	
	public boolean deleteAdminById(int id) {
		Admin admin = entityManager.find(Admin.class, id);
		entityTransaction.begin();
		entityManager.remove(admin);
		entityTransaction.commit();
		return true;
	}
	
//=========================================================================================
	
	// Update the Admin name by id
	
	public boolean updateAdminNameById(int id, String new_name) {
		Admin admin = entityManager.find(Admin.class, id);
		admin.setName(new_name);
		entityTransaction.begin();
		entityManager.merge(admin);
		entityTransaction.commit();
		return true;
	}
	
//========================================================================================
	
	// Update the Admin email by id
	
	public boolean updateAdminEmailById(int id, String new_email) {
		Admin admin = entityManager.find(Admin.class, id);
		admin.setEmail(new_email);
		entityTransaction.begin();
		entityManager.merge(admin);
		entityTransaction.commit();
		return true;	
	}
	
//===========================================================================================
	
	// Update the Admin password by id
	
	public boolean updateAdminPasswordById(int id, String new_password) {
		Admin admin = entityManager.find(Admin.class, id);
		admin.setPassword(new_password);
		entityTransaction.begin();
		entityManager.merge(admin);
		entityTransaction.commit();
		return true;
	}
	
//===========================================================================================
	
	// Get the Admin details by id
	
	public Admin getAdminDetailsById(int id) {
		Admin admin = entityManager.find(Admin.class, id);
		return admin;
	}

//=============================================================================================
	
	// Get all admin details by id
	
	public List<Admin> getAllAdmins() {
		String sql = "Select a from Admin a";
		Query query = entityManager.createQuery(sql);
		
		List<Admin> admin = query.getResultList();
		return admin;
	}
	
//===============================================================================================
	

}
