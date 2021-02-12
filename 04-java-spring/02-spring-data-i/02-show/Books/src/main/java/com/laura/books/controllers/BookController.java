package com.laura.books.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.laura.books.models.Book;
import com.laura.books.services.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bService;
	
	//Get All Books

	@GetMapping("/books")
	public String index(Model viewModel) {
		List<Book> allBooks= this.bService.getAllBooks();
		viewModel.addAttribute("allBooks", allBooks);
		return "index.jsp";	
	}

	//Create A Book
	@GetMapping("/books/add")
	public String addBook(@ModelAttribute("book") Book book) {
		this.bService.createBook(book);
		return "add.jsp";
	}
	
	//Get One Book (Read)
	@GetMapping("/books/{id}")
	public String findById(@ModelAttribute("book") Book book, Model viewModel, @PathVariable("id") Long id) {
		Book singleBook = this.bService.getSingleBook(id);
		viewModel.addAttribute("book", singleBook);
		return "displayBook.jsp";
	}

	//Delete A Book
	@DeleteMapping("/books/delete/{id}")
	public String deleteBook(@PathVariable("id") Long id) {
		this.bService.deleteBook(id);
		return "/books";
	}
}
