package com.example.employeemanagement.service;

import java.util.List;

import com.example.employeemanagement.model.Employee;


public interface EmployeeService {
	
	Employee saveEmployee(Employee employee,long dept_id);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long emp_id);
	
	void deleteEmployee(long emp_id);
	
	

}
