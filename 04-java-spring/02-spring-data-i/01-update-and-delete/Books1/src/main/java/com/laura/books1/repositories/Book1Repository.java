package com.laura.books1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.laura.books1.models.Book1;

@Repository
public interface Book1Repository extends CrudRepository<Book1, Long> {
	//SELECT * FROM books
	List<Book1> findAll();
}
