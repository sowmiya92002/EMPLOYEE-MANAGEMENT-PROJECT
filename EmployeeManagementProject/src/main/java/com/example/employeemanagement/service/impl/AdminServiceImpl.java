package com.example.employeemanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemanagement.exception.UserNotFoundException;
import com.example.employeemanagement.model.Admin;
import com.example.employeemanagement.repository.AdminRepository;
import com.example.employeemanagement.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminRepository adminRepository;

	public AdminServiceImpl(AdminRepository adminRepository) {
		super();
		this.adminRepository = adminRepository;
	}

		@Override
		public Admin loginAdmin(Admin admin) {

			return adminRepository.save(admin);
		}

		

	

	

    
}