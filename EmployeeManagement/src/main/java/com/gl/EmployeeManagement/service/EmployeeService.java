package com.gl.EmployeeManagement.service;

import java.util.List;

import com.gl.EmployeeManagement.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();

	// insert or update
	public void save(Employee theEmployee);

	// deleteById
	public void deleteById(int id);

	public Employee findById(int id);

}
