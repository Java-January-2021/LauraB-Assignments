package com.laura.books.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="books")
public class Book {

	//Generating the database
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  //automatically generate id and increment by 1
	//Book Attributes
	private Long id;  //primary key, always want to be Long
	private String title;
	private String description;
	private String language;
	private int numberOfPages;
	

	//POJO - Empty Constructor  (Java Bean -- creates an empty object for the user to fill in and then stored into the database)
	public Book() {
	}
	
		public Book(String title, String description, String language, int numberOfPages) {
			this.title = title;
			this.description = description;
			this.language = language;
			this.numberOfPages = numberOfPages;
		}

	//Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

}
