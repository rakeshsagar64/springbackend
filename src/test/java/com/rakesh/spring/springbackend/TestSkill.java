package com.rakesh.spring.springbackend;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import com.rakesh.spring.springbackend.model.Skill;
import com.rakesh.spring.springbackend.service.EmployeeIntr;
import com.rakesh.spring.springbackend.service.SkillIntr;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppContext.class)
public class TestSkill {
	
	@Autowired
	SkillIntr skillIntr;
	
	@Autowired
	EmployeeIntr employeeIntr;
	
	private Skill skill;
	
	@Before
	public void setUp() {
		
		
		skill=new Skill();
		skill.setTechnology("java");
		skill.setCertificate("www.cert.com");
		skill.setGithub("www.github.com");
		Set<Employee> employee1=new HashSet<Employee>();
			Employee employee=new Employee();
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
		
		
		employee1.add(employeeIntr.fetchEmployeesById(1));
		skill.setEmployee(employee1);
	}
	@Ignore
	@Test
	public void testAddSkill() {
		assertTrue(skillIntr.addSkill(skill));
		
		
	}
	@Ignore
	@Test
	public void testFetchSkill() {
		List<Skill> fetchAllSkills = skillIntr.fetchAllSkills();
		for(Skill s:fetchAllSkills) {
		System.out.println(s.getEmployee());
		}
		assertFalse(fetchAllSkills.isEmpty());
		
	}

	@Test
	public void testFetchSkillSearch() {
		List<Skill> fetchAllSkills = skillIntr.fetchSkill("java");
		for(Skill s:fetchAllSkills) {
		for (Employee employee : s.getEmployee()) {
			if(employee!=null) {
				System.out.println(employee.getId());
				System.out.println(employee.getFirstName());
				
			}
		}
		}
		assertFalse(fetchAllSkills.isEmpty());
		
	}
	

}
