package com.rakesh.spring.springbackend.dao;

import java.util.List;

import com.rakesh.spring.springbackend.model.Address;

public interface AddressDao  {
	
	public boolean addAddress(Address address);
	public boolean updateAddress(Address address);
	public List<Address> getAddress();
	public Address getAddressById(int id);
	
	
	
}
