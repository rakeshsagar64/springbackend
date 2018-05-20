package com.rakesh.spring.springbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakesh.spring.springbackend.dao.AddressDao;
import com.rakesh.spring.springbackend.model.Address;

@Service(value="addressIntr")
public class AddressServiceImpl implements AddressIntr {

	
	@Autowired
	AddressDao addressDao;
	
	public boolean addAddress(Address address) {
		// TODO Auto-generated method stub
		System.out.println("address addes");
		return addressDao.addAddress(address);
	}

	public boolean updateAddress(Address address) {
		// TODO Auto-generated method stub
		return addressDao.updateAddress(address);
	}

	public List<Address> getAddress() {
		// TODO Auto-generated method stub
		return addressDao.getAddress();
	}

	public Address getAddressById(int id) {
		// TODO Auto-generated method stub
		return addressDao.getAddressById(id);
	}

}
