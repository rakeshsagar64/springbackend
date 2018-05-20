package com.rakesh.spring.springbackend.service;

import java.util.List;

import com.rakesh.spring.springbackend.model.Address;

public interface AddressIntr {

	public boolean addAddress(Address address);
	public boolean updateAddress(Address address);
	public List<Address> getAddress();
	public Address getAddressById(int id);
	
	
}
