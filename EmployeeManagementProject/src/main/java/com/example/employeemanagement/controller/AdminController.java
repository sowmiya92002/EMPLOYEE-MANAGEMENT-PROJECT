package com.example.employeemanagement.controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemanagement.model.Admin;

import com.example.employeemanagement.service.AdminService;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins="http://localhost:4200")
public class AdminController {


	private AdminService adminservice;

	public AdminController(AdminService adminservice) {
		super();
		this.adminservice = adminservice;
	}
	
	@PostMapping
	public ResponseEntity<Admin> loginAdmin(@RequestBody Admin admin)
	{
		System.out.println(admin);
		return new ResponseEntity<Admin>(adminservice.loginAdmin(admin),HttpStatus.CREATED);
	}
	
	
  
   
    
   
    
    
	 
	 
}