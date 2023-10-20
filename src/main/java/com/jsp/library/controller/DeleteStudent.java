package com.jsp.library.controller;

import com.jsp.library.service.StudentService;

public class DeleteStudent {

	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		int id = 2;
		
		if(studentService.deleteStudentById(id) == true) {
			System.out.println("Deleted");
		}
		else {
			System.out.println("Not Deleted");
		}

	}

}
