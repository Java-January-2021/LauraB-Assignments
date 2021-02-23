package com.laura.driverslicenses.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laura.driverslicenses.models.Person;
import com.laura.driverslicenses.repositories.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepo;

	//MAKE CRUD METHODS  CRUD: C = Create  R = Read   U = Update   D = Delete
	
	//Get All Persons	
	public List<Person> getAllPersons(){
		return this.personRepo.findAll();
	}
	
	//Create A Person
	public Person createPerson(Person newPerson) {
		return this.personRepo.save(newPerson);
	}
	
	//Get One Person (Read)
	public Person getPerson(Long id) {
		return this.personRepo.findById(id).orElse(null); //id is an optional(a boolean) (return everything or nothing)
	}
	
	//Update a Person
	public Person updatePerson(Person personToUpdate) {
		return this.personRepo.save(personToUpdate);
	}

	//Delete A Person
	public void deletePerson(Long id) {  //note:  not public Person here because we are returning a string confirmation
		this.personRepo.deleteById(id);
	}	

}
