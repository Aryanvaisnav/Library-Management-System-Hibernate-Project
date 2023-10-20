package com.jsp.library.controller;

import com.jsp.library.service.StudentService;

public class UpdateStudentName {

	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		int id = 5;
		String new_name = "ABC";
		if(studentService.updateStudentNameById(id, new_name) == true) {
			System.out.println("Name is Updated");
		}
		else {
			System.out.println("Not Updated");
		}

	}

}
