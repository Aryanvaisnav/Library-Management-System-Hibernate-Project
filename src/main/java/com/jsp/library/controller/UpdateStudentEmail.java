package com.jsp.library.controller;

import com.jsp.library.service.StudentService;

public class UpdateStudentEmail {

	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		int id = 5;
		String new_email = "abc@mail.com";
		
		if(studentService.updateStudentEmailById(id, new_email) == true) {
			System.out.println("Email is Updated");
		}
		else {
			System.out.println("Not Updated");
		}

	}

}
