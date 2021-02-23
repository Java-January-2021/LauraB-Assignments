package com.laura.driverslicenses.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.laura.driverslicenses.models.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{
	//SELECT * FROM persons
	List<Person> findAll();
}
