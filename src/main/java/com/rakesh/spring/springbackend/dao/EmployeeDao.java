package com.rakesh.spring.springbackend.dao;

import com.rakesh.spring.springbackend.model.Employee;

public interface EmployeeDao {
	public boolean addEmployee(Employee employee);

	public Employee fetchEmployee(int id);
}
