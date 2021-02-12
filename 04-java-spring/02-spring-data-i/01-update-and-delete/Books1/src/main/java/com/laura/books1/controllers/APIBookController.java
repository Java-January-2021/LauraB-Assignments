package com.laura.books1.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.laura.books1.models.Book1;
import com.laura.books1.services.Book1Service;

@RestController //RestController only good for API
@RequestMapping("api/books")
public class APIBookController {
	private Book1Service bService;
	
	public APIBookController(Book1Service service) {
		this.bService = service;
	}
	
	//ROUTES:
	
	//Get All Books

	@RequestMapping("")
	public List<Book1> index(){
		return this.bService.getAllBooks();
	}
	
	
	//Get One Book (Read)
	@RequestMapping("/{id}")  //Get Request
	public Book1 getBook(@PathVariable("id") Long id) {
		return this.bService.getSingleBook(id);
	}
	
	//Create A Book
	@RequestMapping(value="/", method=RequestMethod.POST) //Post Request
	public Book1 create(Book1 book) {
		return this.bService.createBook(book);
	}
	
	//Update a Book
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public Book1 edit(@PathVariable("id") Long id, Book1 updatedBook) {
		return this.bService.updateBook(updatedBook);
	}

	//Delete a Book
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteBook(@PathVariable("id") Long id) {
		this.bService.deleteBook(id);
	}
}