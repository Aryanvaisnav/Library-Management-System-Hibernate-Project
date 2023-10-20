package com.jsp.library.controller;

import com.jsp.library.dto.Student;
import com.jsp.library.service.StudentService;

public class SaveStudent {

	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		Student student = new Student();
		student.setName("xyz");
		student.setEmail("xyz@mail.com");
		
		studentService.saveStudent(student);

	}

}
