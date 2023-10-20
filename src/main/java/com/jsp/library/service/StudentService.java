package com.jsp.library.service;

import java.util.List;

import com.jsp.library.dao.StudentDao;
import com.jsp.library.dto.Student;

public class StudentService {
	
	StudentDao studentDao = new StudentDao();
	
//======================================================================================================
	
	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}
	
//======================================================================================================
	
	public boolean deleteStudentById(int id) {
		Student student = studentDao.getStudentDetailsById(id);
		if(student != null) {
			return studentDao.deleteStudentById(id);
		}
		else {
			return false;
		}
	}
	
//=========================================================================================================
	
	public boolean updateStudentNameById(int id, String new_name) {
		Student student = studentDao.getStudentDetailsById(id);
		if(student != null) {
			return studentDao.updateStudentNameById(id, new_name);
		}
		else {
			return false;
		}
	}
	
//==========================================================================================================
	
	public boolean updateStudentEmailById(int id, String new_email) {
		Student student = studentDao.getStudentDetailsById(id);
		if(student != null) {
			return studentDao.updateStudentEmailById(id, new_email);
		}
		else {
			return false;
		}
	}
	
//===========================================================================================================
	
	public Student getStudentDetailsById(int id) {
		Student student = studentDao.getStudentDetailsById(id);
		if(student != null) {
			return studentDao.getStudentDetailsById(id);
		}
		else {
			return null;
		}
	}
	
//=============================================================================================================
	
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}
	
//=============================================================================================================

}
