package com.jsp.library.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String status;
	
	@OneToOne
	private Librarian librarian;
	
	@OneToOne
	private Student student;

	
	// Id
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// Name
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Status
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// Librarian
	
	public Librarian getLibrarian() {
		return librarian;
	}

	public void setLibrarian(Librarian librarian) {
		this.librarian = librarian;
	}

	// Student
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}
