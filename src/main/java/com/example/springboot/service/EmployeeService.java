package com.example.springboot.service;

import java.util.List;

import com.example.springboot.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(String theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(String theId);
}
