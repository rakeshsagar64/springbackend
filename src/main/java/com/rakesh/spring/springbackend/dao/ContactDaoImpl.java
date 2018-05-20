package com.rakesh.spring.springbackend.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rakesh.spring.springbackend.model.Contacts;

@Repository(value="contactDAO")
@Transactional
public class ContactDaoImpl implements ContactDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public List<Contacts> findAll() {
		// TODO Auto-generated method stub
		List<Contacts> list = sessionFactory.getCurrentSession().createQuery("from Contacts").list();
		return list;
	}

	public Contacts findById(int id) throws ContactNotFoundException {
		// TODO Auto-generated method stub
	return sessionFactory.getCurrentSession().find(Contacts.class, id);
		
	}

	public boolean updateContact(Contacts contact) throws ContactNotFoundException {
		// TODO Auto-generated method stub

		if(findById(contact.getId())!=null) {
			sessionFactory.getCurrentSession().update(contact);
			return true;
		}
		else {
			return false;
		}
		
	}

	public boolean deleteContact(Contacts contact) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addContact(Contacts contact) {
		// TODO Auto-generated method stub
		
		return sessionFactory.getCurrentSession().save(contact)!=null;
	}

}
