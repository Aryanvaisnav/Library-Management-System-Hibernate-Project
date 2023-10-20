package com.jsp.library.service;

import java.util.List;

import com.jsp.library.dao.BookDao;
import com.jsp.library.dao.LibrarianDao;
import com.jsp.library.dao.StudentDao;
import com.jsp.library.dto.Book;
import com.jsp.library.dto.Librarian;
import com.jsp.library.dto.Student;

public class LibrarianService {

	LibrarianDao librarianDao = new LibrarianDao();
	BookDao bookDao = new BookDao();

//========================================================================================================

	public Librarian saveLibrarian(Librarian librarian) {
		return librarianDao.saveLibrarian(librarian);

	}

//========================================================================================================

	public boolean deleteLibrarianById(int id) {
		Librarian librarian = librarianDao.getLibrarianDetailsById(id);
		if (librarian != null) {
			return librarianDao.deleteLibrarianById(id);
		} else {
			return false;
		}
	}

//========================================================================================================

	public boolean updateLibrarianNameById(int id, String new_name) {
		Librarian librarian = librarianDao.getLibrarianDetailsById(id);
		if (librarian != null) {
			return librarianDao.updateLibrarianNameById(id, new_name);
		} else {
			return false;
		}
	}

//=========================================================================================================

	public boolean updateLibrarianEmailById(int id, String new_email) {
		Librarian librarian = librarianDao.getLibrarianDetailsById(id);
		if (librarian != null) {
			return librarianDao.updateLibrarianEmailById(id, new_email);
		} else {
			return false;
		}
	}

//=========================================================================================================

	public boolean updateLibrarianPasswordById(int id, String new_password) {
		Librarian librarian = librarianDao.getLibrarianDetailsById(id);
		if (librarian != null) {
			return librarianDao.updateLibrarianPasswordById(id, new_password);
		} else {
			return false;
		}
	}

//==========================================================================================================

	public Librarian getLibrarianDetailsById(int id) {
		Librarian librarian = librarianDao.getLibrarianDetailsById(id);
		if (librarian != null) {
			return librarianDao.getLibrarianDetailsById(id);
		} else {
			return null;
		}
	}

//============================================================================================================

	public List<Librarian> getAllLibrarians() {
		return librarianDao.getAllLibrarians();
	}

//=================================================================================================================================================================

	public boolean librarianLogin(int id, String name, String email, String password) {
		Librarian librarian = librarianDao.getLibrarianDetailsById(id);
		if (librarian.getName().equals(name) == true && librarian.getEmail().equals(email) == true
				&& librarian.getPassword().equals(password) == true && librarian != null) {
			return true;
		} else {
			return false;
		}
	}

//=================================================================================================================================================================

	// Add a book

	public Book addBook(Book book) {
		return bookDao.addBook(book);

	}

//=====================================================================================================================

	// Remove a book

	public boolean removeBookById(int id) {
		Book book = bookDao.getBookDetailsById(id);
		if (book != null) {
			return bookDao.removeBookById(id);
		} else {
			return false;
		}
	}

//=========================================================================================================================

	// Issue a book

	public Book issueBook(int stu_id, int lib_id, int book_id) {
		StudentDao studentDao = new StudentDao();
		Student student = studentDao.getStudentDetailsById(stu_id);
		Librarian librarian = librarianDao.getLibrarianDetailsById(lib_id);
		Book book = bookDao.getBookDetailsById(book_id);
		if (student != null && librarian != null && book != null) {
			book.setStudent(student);
			book.setLibrarian(librarian);
			book.setStatus("Issued");
			return bookDao.issueBook(book);

		} else {
			return null;
		}

	}

//=============================================================================================================================

	// Return a Book

	public Book returnBook(int stu_id, int lib_id, int book_id) {
		StudentDao studentDao = new StudentDao();
		Student student = studentDao.getStudentDetailsById(stu_id);
		Librarian librarian = librarianDao.getLibrarianDetailsById(lib_id);
		Book book = bookDao.getBookDetailsById(book_id);
		if (student != null && librarian != null && book != null) {
			book.setStatus("Available");
			book.setStudent(null);
			book.setLibrarian(null);
			return bookDao.returnBook(book);

		} else {
			return null;
		}

	}

//========================================================================================================================

	// Accepting the student Request

	public Student requestedBookAccepted(int stu_id, String book_requested) {
		StudentDao studentDao = new StudentDao();
		Student student = studentDao.getStudentDetailsById(stu_id);
		List<Book> books = bookDao.getAllBooks();
		int count = 0;
		for (Book b : books) {
			if (b.getName().equalsIgnoreCase(book_requested) && b.getStatus().equalsIgnoreCase("Available")) {
				System.out.println(b.getId());
				System.out.println(b.getName());
				System.out.println("===============================================");
				count++;
			} else {
				System.out.println("Requested Book not found");
			}
		}
		if (count > 0) {
			student.setRequest_status("Accepted");
			return studentDao.requestBook(student);
		} else if (count == 0) {
			student.setRequest_status("Rejected");
			return studentDao.requestBook(student);
		} else {
			return null;
		}

	}

//========================================================================================================================================

}
