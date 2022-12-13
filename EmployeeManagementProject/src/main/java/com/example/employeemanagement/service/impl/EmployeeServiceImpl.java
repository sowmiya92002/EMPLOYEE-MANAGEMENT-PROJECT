package com.example.employeemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.employeemanagement.exception.UserNotFoundException;
import com.example.employeemanagement.model.Department;
import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import com.example.employeemanagement.service.DepartmentService;
import com.example.employeemanagement.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	 @Autowired
	private EmployeeRepository employeeRepository;
	private DepartmentService departmentService;
	
	
	



	public EmployeeServiceImpl(EmployeeRepository employeeRepository, DepartmentService departmentService) {
		super();
		this.employeeRepository = employeeRepository;
		this.departmentService = departmentService;
	}



	@Override
	public Employee saveEmployee(Employee employee,long dept_id) {
		// TODO Auto-generated method stub
		Department department=departmentService.getDepartById(dept_id);
		employee.setDepartment(department);
		return employeeRepository.save(employee);
	}



	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}



	@Override
	public Employee getEmployeeById(long emp_id) {
	
		return employeeRepository.findById(emp_id).orElseThrow(()->new UserNotFoundException("Employee","Id",emp_id));
		
	}



	



	@Override
	public void deleteEmployee(long emp_id) {
		// TODO Auto-generated method stub
		employeeRepository.findById(emp_id).orElseThrow(()->new UserNotFoundException("Employee","Id",emp_id));
		employeeRepository.deleteById(emp_id);
		
	}

}
