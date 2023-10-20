package com.jsp.library.controller;

import com.jsp.library.dto.Student;
import com.jsp.library.service.StudentService;

public class GetStudentById {

	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		int id = 5;
		
		Student student = studentService.getStudentDetailsById(id);
		
		if(student != null) {
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getEmail());
		}
		else {
			System.out.println("This record is deleted or does not exist");
		}

	}

}
