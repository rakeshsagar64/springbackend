package com.rakesh.spring.springbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakesh.spring.springbackend.dao.ContactDao;
import com.rakesh.spring.springbackend.dao.ContactNotFoundException;
import com.rakesh.spring.springbackend.model.Contacts;

@Service(value="service1")
public class Service1 implements ServiceImpl {
	
	@Autowired
	ContactDao contactDAO;
	
	public List<Contacts> findAll() {
		// TODO Auto-generated method stub
		return contactDAO.findAll();
	}

	public Contacts findById(int id) throws ContactNotFoundException {
		// TODO Auto-generated method stub
		return contactDAO.findById(id);
	}

	public boolean updateContact(Contacts contact) throws ContactNotFoundException {
		// TODO Auto-generated method stub
		return contactDAO.updateContact(contact);
	}

	public boolean deleteContact(Contacts contact) {
		// TODO Auto-generated method stub
		return contactDAO.deleteContact(contact);
	}

	public boolean addContact(Contacts contact) {
		// TODO Auto-generated method stub
		return contactDAO.addContact(contact);
	}

}
