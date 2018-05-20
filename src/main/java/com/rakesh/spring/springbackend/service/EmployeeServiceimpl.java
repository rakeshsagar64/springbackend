package com.rakesh.spring.springbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakesh.spring.springbackend.dao.EmployeeDao;
import com.rakesh.spring.springbackend.model.Employee;

@Service(value="employeeIntr")
public class EmployeeServiceimpl implements EmployeeIntr{
	
	@Autowired
	EmployeeDao employeeDao;
	
	
	public boolean addEmployee(Employee employee) {
		
		return employeeDao.addEmployee(employee);
	}
	
	
	public Employee fetchEmployeesById(int id){
		return employeeDao.fetchEmployee(id);
		
		
	}

}
