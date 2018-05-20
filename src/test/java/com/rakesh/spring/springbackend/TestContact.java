package com.rakesh.spring.springbackend;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.rakesh.spring.springbackend.config.AppContext;
import com.rakesh.spring.springbackend.model.Contacts;
import com.rakesh.spring.springbackend.service.Service1;



@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppContext.class)

public class TestContact {

	@Autowired 
	private Service1 service;
	
	
	private Contacts contact1;
	@Before
	public void setUp() {
		contact1=new Contacts();
		//contact1.setId(5);
		contact1.setEmail("somemail@gmail.com");
		contact1.setLinkedinLink("www.linkedin.com");
		
		
		
	}
	
	@Ignore
	@Test
	public void addContact() {
		
		assertTrue(service.addContact(contact1));
		
	}
	@Ignore
	@Test
	public void findAll() {
		List<Contacts> findAll = service.findAll();
		System.out.println(findAll);
		
	}
	
	
	
}
