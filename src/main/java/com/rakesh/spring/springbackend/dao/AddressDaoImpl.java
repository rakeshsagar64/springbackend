package com.rakesh.spring.springbackend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rakesh.spring.springbackend.model.Address;

@Repository(value="addressDao")
@Transactional

public class AddressDaoImpl  implements AddressDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean addAddress(Address address) {
		// TODO Auto-generated method stub
		
		return sessionFactory.getCurrentSession().save(address)!=null;
		
	}

	public boolean updateAddress(Address address) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(address);
		return false;
	}

	public List<Address> getAddress() {
		// TODO Auto-generated method stub
		
		return sessionFactory.getCurrentSession().createQuery("from Addresses").list();
	}

	public Address getAddressById(int id) {
		// TODO Auto-generated method stub
		
		return sessionFactory.getCurrentSession().find(Address.class,id);
	}

}
