package com.laura.driverslicenses.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laura.driverslicenses.models.License;
import com.laura.driverslicenses.repositories.LicenseRepository;

@Service
public class LicenseService {
	@Autowired
	private LicenseRepository licenseRepo;
	
	//MAKE CRUD METHODS  CRUD: C = Create  R = Read   U = Update   D = Delete
	
	//Get All Licenses	
	public List<License> getAllLicenses(){
		return this.licenseRepo.findAll();
	}
	
	//Create A License
	public License createLicense(License newLicense) {
		return this.licenseRepo.save(newLicense);
	}
	
	//Get One License (Read)
	public License getSingleLicense(Long id) {
		return this.licenseRepo.findById(id).orElse(null); //id is an optional(a boolean) (return everything or nothing)
	}
	
	//Update a License
	public License updateLicense(License licenseToUpdate) {
		return this.licenseRepo.save(licenseToUpdate);
	}

	//Delete A License
	public void deleteLicense(Long id) {  //note:  not public License here because we are returning a string confirmation
		this.licenseRepo.deleteById(id);
	}

}
