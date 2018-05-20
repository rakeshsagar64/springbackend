package com.rakesh.spring.springbackend.service;

import com.rakesh.spring.springbackend.model.Employee;

public interface EmployeeIntr {
	
	public boolean addEmployee(Employee employee);
	
	public Employee fetchEmployeesById(int id);
}
