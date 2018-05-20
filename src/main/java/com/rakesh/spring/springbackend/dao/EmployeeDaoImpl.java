package com.rakesh.spring.springbackend.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rakesh.spring.springbackend.model.Employee;

@Repository(value="employeeDao")
@Transactional
public class EmployeeDaoImpl  implements EmployeeDao{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public boolean addEmployee(Employee employee) {
		
		return sessionFactory.getCurrentSession().save(employee)!=null;
		
	}

	public Employee fetchEmployee(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().find(Employee.class, id);
	}
	
	
	
}
