package com.rakesh.spring.springbackend.dao;

import java.util.List;

import com.rakesh.spring.springbackend.model.Contacts;

public interface ContactDao {
	List<Contacts> findAll();
	Contacts findById(int id) throws ContactNotFoundException;
	boolean updateContact(Contacts contact) throws ContactNotFoundException;
	boolean deleteContact(Contacts contact);
	boolean addContact(Contacts contact);
}
