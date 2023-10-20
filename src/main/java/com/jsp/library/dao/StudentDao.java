package com.jsp.library.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.library.dto.Student;

public class StudentDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aryan");
	
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
//==============================================================================================================
	
	// Insert the student details
	
	public Student saveStudent(Student student) {
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}
	
//===============================================================================================================
	
	// Delete the student details by id
	
	public boolean deleteStudentById(int id) {
		Student student = entityManager.find(Student.class, id);
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
		return true;
	}
	
//=================================================================================================================
	
	// Update the student name by id
	
	public boolean updateStudentNameById(int id, String new_name) {
		Student student = entityManager.find(Student.class, id);
		student.setName(new_name);
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		return true;
	}
	
//====================================================================================================================
	
	// Update the student email by id
	
	public boolean updateStudentEmailById(int id, String new_email) {
		Student student = entityManager.find(Student.class, id);
		student.setEmail(new_email);
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		return true;
	}
	
//=======================================================================================================================
	
	// Get the details of student by id
	
	public Student getStudentDetailsById(int id) {
		Student student = entityManager.find(Student.class, id);
		return student;
	}
	
//======================================================================================================================
	
	// Get the details of all students
	
	public List<Student> getAllStudents() {
		String sql = "Select s from Student s";
		Query query = entityManager.createQuery(sql);
		List<Student> student = query.getResultList();
		return student;
	}
	
//======================================================================================================================

	// Request Status
	
	public Student requestBook(Student student) {
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		return student;
	}
	
//======================================================================================================================
	
}
