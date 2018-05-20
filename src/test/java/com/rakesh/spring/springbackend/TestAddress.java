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
import com.rakesh.spring.springbackend.service.AddressIntr;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppContext.class)
public class TestAddress {

	@Autowired
	AddressIntr addressIntr;
	
	
	private Address address;
	@Before
	public void setUp() throws Exception {
		address=new Address();
		address.setCity("Mysore");
		address.setState("Karnatka");
		address.setCountry("India");
	}
	@Ignore
	@Test
	public void testAddressInsert() {
		assertTrue(addressIntr.addAddress(address));
	}

}
