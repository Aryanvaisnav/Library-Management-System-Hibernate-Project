package com.jsp.library.controller;

import com.jsp.library.service.LibrarianService;

public class LibrarianLogin {

	public static void main(String[] args) {
		LibrarianService librarianService = new LibrarianService();
		int id = 1;
		String name = "Ken";
		String email = "ken@mail.com";
		String password = "ken11";
		
		if(librarianService.librarianLogin(id, name, email, password) == true) {
			System.out.println("Login Successfully");
		}
		else {
			System.out.println("You have entered the wrong credentials");
		}

	}

}
