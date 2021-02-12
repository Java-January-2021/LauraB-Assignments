package com.laura.books1.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.laura.books1.models.Book1;
import com.laura.books1.services.Book1Service;

@Controller
public class Book1Controller {
	@Autowired
	private Book1Service bService;
	
	//Get All Books

	@GetMapping("/books")
	public String index(Model viewModel) {
		List<Book1> allBooks= this.bService.getAllBooks();
		viewModel.addAttribute("allBooks", allBooks);
		return "index.jsp";	
	}

	//Create A Book
	@GetMapping("/books/add")
	public String addBook(@ModelAttribute("Book") Book1 book) {
		return "add.jsp";
	}
	
	@PostMapping("/books/add")
	//@Valid annotation checks to see if the submitted object passes validation
	public String addB(@Valid @ModelAttribute("Book") Book1 book, BindingResult result) {

		if(result.hasErrors()) {
			return "add.jsp";  //going to WEB-INF file
		}
		this.bService.createBook(book);
		return "redirect:/books";
	}
	

	//Get One Book (Read)
	@GetMapping("/books/{id}")
	public String findById(@ModelAttribute("book") Book1 book, Model viewModel, @PathVariable("id") Long id) {
		Book1 singleBook = this.bService.getSingleBook(id);
		viewModel.addAttribute("book", singleBook);
		return "displayBook.jsp";
	}
	
	//Update A Book
	@PostMapping("/edit/{id}")
	public String updateBook(@Valid @ModelAttribute("book") Book1 book, BindingResult result, @PathVariable("id") Long id, Model viewModel) {

		if(result.hasErrors()) {
			return "add.jsp";  //going to WEB-INF file
		}
			this.bService.updateBook(book);
			return "redirect:/books/{id}";
	}
	
	//Delete A Book
	@GetMapping("/books/delete/{id}")
	public String deleteBook(@PathVariable("id") Long id) {
		this.bService.deleteBook(id);
		return "redirect:/books";
	}
}
