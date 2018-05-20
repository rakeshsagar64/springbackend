package com.rakesh.spring.springbackend;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.rakesh.spring.springbackend.config.AppContext;
import com.rakesh.spring.springbackend.model.Address;
import com.rakesh.spring.springbackend.model.Contacts;
import com.rakesh.spring.springbackend.model.Employee;
import com.rakesh.spring.springbackend.service.EmployeeIntr;


@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppContext.class)

public class TestEmployee {
	
	@Autowired
	EmployeeIntr employeeIntr;
	
	Employee employee;
	
	@Before
	public void setUp() {
		employee=new Employee();
		employee.setFirstName("Ramu");
		employee.setLastName("Raju");
		employee.setYearsOfExperience(2);
		employee.setCurrentRole("Developer");
		Address address=new Address();
		address.setCity("Mysore");
		address.setState("Karnatka");
		address.setCountry("India");
		
		Contacts contact1=new Contacts();
		//contact1.setId(5);
		contact1.setEmail("somemail@gmail.com");
		contact1.setLinkedinLink("www.linkedin.com");
		employee.setAddress(address);
		employee.setContacts(contact1);
		
		
	}
	@Ignore
	@Test
	public void testAddEmployee() {
		
		assertTrue(employeeIntr.addEmployee(employee));
		
	}
}
