package com.rakesh.spring.springbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="Contacts")
public class Contacts {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NonNull
	private String email;
	
	@NonNull
	private String linkedinLink;
	
	
	public String getLinkedinLink() {
		return linkedinLink;
	}
	public void setLinkedinLink(String linkedinLink) {
		this.linkedinLink = linkedinLink;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String toString() {
		
		return email;
		
	}
	
}
