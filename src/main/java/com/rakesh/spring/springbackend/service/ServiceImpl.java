package com.rakesh.spring.springbackend.service;

import java.util.List;

import com.rakesh.spring.springbackend.dao.ContactNotFoundException;
import com.rakesh.spring.springbackend.model.Contacts;

public interface ServiceImpl {
	
	public List<Contacts> findAll();
	public Contacts findById(int id) throws ContactNotFoundException;
	public boolean updateContact(Contacts contact) throws ContactNotFoundException;
	public boolean deleteContact(Contacts contact);
	public boolean addContact(Contacts contact);

}
