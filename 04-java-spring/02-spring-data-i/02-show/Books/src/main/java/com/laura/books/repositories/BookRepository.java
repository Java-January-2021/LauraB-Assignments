package com.laura.books.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.laura.books.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

	//same as SELECT * FROM books
	List<Book> findAll();
}
