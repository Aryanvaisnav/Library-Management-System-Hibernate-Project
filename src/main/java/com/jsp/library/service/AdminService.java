package com.jsp.library.service;

import java.util.ArrayList;
import java.util.List;

import com.jsp.library.dao.AdminDao;
import com.jsp.library.dao.LibrarianDao;
import com.jsp.library.dto.Admin;
import com.jsp.library.dto.Librarian;

public class AdminService {
	
	AdminDao adminDao = new AdminDao();
	Librarian librarian = new Librarian();
	LibrarianDao librarianDao = new LibrarianDao();
	
//========================================================================================================
	
	
	public Admin saveAdmin(Admin admin) {
		return adminDao.saveAdmin(admin);
		
	}
	
//========================================================================================================
	
	public boolean deleteAdminById(int id) {
		Admin admin = adminDao.getAdminDetailsById(id);
		if(admin != null) {
			return adminDao.deleteAdminById(id);
		}
		else {
			return false;
		}
	}
	
//========================================================================================================
	
	public boolean updateAdminNameById(int id, String new_name) {
		Admin admin = adminDao.getAdminDetailsById(id);
		if(admin != null) {
			return adminDao.updateAdminNameById(id, new_name);
		}
		else {
			return false;
		}
	}
	
//=========================================================================================================
	
	public boolean updateAdminEmailById(int id, String new_email) {
		Admin admin = adminDao.getAdminDetailsById(id);
		if(admin != null) {
			return adminDao.updateAdminEmailById(id, new_email);
		}
		else {
			return false;
		}
	}
	
//=========================================================================================================
	
	public boolean updateAdminPasswordById(int id, String new_password) {
		Admin admin = adminDao.getAdminDetailsById(id);
		if(admin != null) {
			return adminDao.updateAdminPasswordById(id, new_password);
		}
		else {
			return false;
		}
	}
	
//==========================================================================================================
	
	public Admin getAdminDetailsById(int id) {
		Admin admin = adminDao.getAdminDetailsById(id);
		if(admin != null) {
			return adminDao.getAdminDetailsById(id);
		}
		else {
			return null;
		}
	}
	
//============================================================================================================
	
	public List<Admin> getAllAdmins() {
		return adminDao.getAllAdmins();
	}

//=================================================================================================================================================================
	
	public boolean adminLogin(int id, String name, String email, String password) {
		Admin admin = adminDao.getAdminDetailsById(id);
		if(admin.getName().equals(name) == true && admin.getEmail().equals(email) == true && admin.getPassword().equals(password) == true && admin != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
//=================================================================================================================================================================
	
	// Permission - Authorized
	
	public Librarian permitGranted(int a_id, int lib_id) {
		Admin admin = adminDao.getAdminDetailsById(a_id);
		Librarian librarian = librarianDao.getLibrarianDetailsById(lib_id);
		if(admin != null && librarian != null) {
			librarian.setStatus("Authorized");
			librarian.setAdmin(admin);
			return librarianDao.permit(librarian);
		}
		else {
			return null;
		}
		
	}
	
//=========================================================================================================
	
	// Permission - UnAuthorized

	public Librarian permitNotGranted(int a_id, int lib_id) {
		Admin admin = adminDao.getAdminDetailsById(a_id);
		Librarian librarian = librarianDao.getLibrarianDetailsById(lib_id);
		if(admin != null && librarian != null) {
			librarian.setStatus("UnAuthorized");
			librarian.setAdmin(admin);
			return librarianDao.permit(librarian);
		}
		else {
			return null;
		}
		
	}
	
//=========================================================================================================
	
	// To get all the unauthorized librarians
	
	public List<Librarian> getAllUnauthorizedLibrarians() {
		List<Librarian> librarians = librarianDao.getAllLibrarians();
		List<Librarian> lib = null;
		for(Librarian l : librarians) {
			if(l.getStatus().equals("UnAuthorized") == true) {
				lib = new ArrayList<>();
				lib.add(l);
			}
		}
		return lib;
	}

//========================================================================================================
	
}
