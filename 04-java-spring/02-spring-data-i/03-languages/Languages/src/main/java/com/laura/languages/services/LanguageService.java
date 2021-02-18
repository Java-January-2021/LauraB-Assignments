package com.laura.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.laura.languages.models.Language;
import com.laura.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	//Dependency Injection

	private LanguageRepository lRepo; //gives us access to the Repository
	
	public LanguageService(LanguageRepository repo) {
		this.lRepo = repo;
	}
	
	//MAKE CRUD METHODS  CRUD: C = Create  R = Read   U = Update   D = Delete
	
	//Get All Languages
	public List<Language> getAllLanguages(){
		return this.lRepo.findAll();
	}
	
	//Create A Language
	public Language createLanguage(Language newLanguage) {
		return this.lRepo.save(newLanguage);
	}
	
	//Get One Language (Read)
	public Language getSingleLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null); //id is an optional(a boolean) (return everything or nothing)
	}

	//Update A Language
	public Language updateLanguage(Language updatedLanguage) {
		return this.lRepo.save(updatedLanguage);
	}
	
	//Delete A Language
	public void deleteLanguage(Long id) {  //note:  not public Language here because we are returning a string confirmation
		this.lRepo.deleteById(id);
	}
}
