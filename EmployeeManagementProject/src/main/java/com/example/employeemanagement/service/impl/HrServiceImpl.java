package com.example.employeemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.employeemanagement.exception.UserNotFoundException;
import com.example.employeemanagement.model.Department;
import com.example.employeemanagement.model.HR;
import com.example.employeemanagement.repository.HrRepository;
import com.example.employeemanagement.service.DepartmentService;
import com.example.employeemanagement.service.HrService;

@Service
public class HrServiceImpl implements HrService{
	@Autowired
	private HrRepository hrRepository;
	private DepartmentService departmentService;
	

	public HrServiceImpl(HrRepository hrRepository,DepartmentService departmentService) {
		super();
		this.hrRepository = hrRepository;
		this.departmentService=departmentService;
	}

	@Override
	public HR addHr(HR hr,long dept_id) {
		// TODO Auto-generated method stub
		Department department=departmentService.getDepartById(dept_id);
		hr.setDepartment(department);
		return hrRepository.save(hr);
	}

	@Override
	public List<HR> getAllHr() {
		// TODO Auto-generated method stub
		return hrRepository.findAll();
	}

	@Override
	public HR getHrById(long hr_id) {
		// TODO Auto-generated method stub
		return hrRepository.findById(hr_id).orElseThrow(()->new UserNotFoundException("HR","Id",hr_id));
	}

	@Override
	public HR updateHr(HR hr, long hr_id) {
		// TODO Auto-generated method stub
		HR existingHr=hrRepository.findById(hr_id).orElseThrow(()-> new UserNotFoundException("HR","Id",hr_id));
		existingHr.setHr_name(hr.getHr_name());
		existingHr.setEmail(hr.getEmail());
		
		hrRepository.save(existingHr);
		return existingHr;
	}

	@Override
	public void deleteHr(long hr_id) {
		// TODO Auto-generated method stub
		
	}
	
}