package com.laura.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.laura.languages.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{
	//SELECT * FROM languages
	List<Language> findAll();
}
