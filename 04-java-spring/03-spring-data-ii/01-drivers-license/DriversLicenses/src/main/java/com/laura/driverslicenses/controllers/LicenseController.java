package com.laura.driverslicenses.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
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

import com.laura.driverslicenses.models.License;
import com.laura.driverslicenses.models.Person;
import com.laura.driverslicenses.services.LicenseService;
import com.laura.driverslicenses.services.PersonService;

@Controller
public class LicenseController {
	@Autowired
	private PersonService personService;
	@Autowired
	private LicenseService licenseService;
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
//	//Get All Persons
//	@GetMapping("/") //localhost:8080
//	public String getAllPersons(@ModelAttribute("Person") Person person, Model viewModel) {
//		List<Person> everyPerson = personService.getAllPersons();
//		viewModel.addAttribute("everyPerson", everyPerson);
//		return "index.jsp";	
//	}
	
	//Create a Person
	@GetMapping("/persons/newPerson")
	public String addPerson(@ModelAttribute("person") Person person) {
		return "newPerson.jsp";
	}
	
	@PostMapping("/persons/newPerson")
    public String addP(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		
		if (result.hasErrors()) {
            return "newPerson.jsp";
        }
		
		else {
			this.personService.createPerson(person);
			System.out.println(person.getFirstName() + " " + person.getLastName() + " has been added!");

		}        

		return "redirect:/licenses/newLicense";
	}
	
	//Create a License
	@GetMapping("/licenses/newLicense")
	public String newLicense(@ModelAttribute("license") License license, Model viewModel) {
		List<Person> everyPerson = personService.getAllPersons();
		viewModel.addAttribute("everyPerson", everyPerson);
		return "newLicense.jsp";
	}
	
	@PostMapping("/licenses/newLicense")
	public String createLicense(@Valid @ModelAttribute("license") License license, BindingResult result) {

		if (result.hasErrors()) {
            return "newLicense.jsp";
        }
		
			License newLicense = this.licenseService.createLicense(license);
			Long newLicensePersonId = newLicense.getPerson().getId();//get the person's id
			System.out.println("License number generated.");  ///NOTHING IS GETTING ADDED TO DB HERE!!!

		return "redirect:/licenses/details/" + newLicensePersonId; //will take us to line 87 (@GetMapping("/licenses/{id}"))
		}

	//Get One License (Read)
	@GetMapping("/licenses/details/{id}")
	public String details(@PathVariable("id") Long id, Model viewModel) {
		License license = licenseService.getSingleLicense(id);
		
		if( license != null) {			
			Date expireDate = license.getExpirationDate();
			viewModel.addAttribute("person", this.personService.getPerson(id));
			viewModel.addAttribute("license", license);
			viewModel.addAttribute("expDate", expireDate);
			return "details.jsp";
		}
		
			viewModel.addAttribute("person", this.personService.getPerson(id));
			return "details.jsp";
	}	

}
