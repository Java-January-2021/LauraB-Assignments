package com.laura.books1.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.laura.books1.models.Book1;
import com.laura.books1.repositories.Book1Repository;

@Service
public class Book1Service {
	//Dependency Injection
	private Book1Repository bRepo;  //gives is access to the Repository
	
	public Book1Service(Book1Repository repo) {
		this.bRepo = repo;
	}
	
	//CRUD :  C = Create  R = Read   U = Update   D = Delete
	
	//Get All Books
	public List<Book1> getAllBooks(){
		return this.bRepo.findAll();
	}
	
	//Create A Book
	public Book1 createBook(Book1 newBook) {
		return this.bRepo.save(newBook);
	}
	
	//Get One Book1 (Read)
	public Book1 getSingleBook(Long id) {
		return this.bRepo.findById(id).orElse(null); //id is an optional(a boolean) (return everything or nothing)
	}

	//Update A Book
	public Book1 updateBook(Book1 updatedBook) {
		return this.bRepo.save(updatedBook);
	}
	
	//Delete A Book
	public String deleteBook(Long id) {  //note:  not public Book1 here because we are returning a string confirmation
		this.bRepo.deleteById(id);
		return "Book1 " + id + " has been deleted"; //confirms that the Record has been deleted
	}
	
	//Create object with parameters -- this is the old way
	public Book1 createBookOldway(String title, String description, String language, int numberOfPages) {
		Book1 newBook = new Book1(title, description, language, numberOfPages);
		return this.bRepo.save(newBook);
	}
}
