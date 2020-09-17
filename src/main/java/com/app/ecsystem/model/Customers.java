package com.app.ecsystem.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customers {
	
	@Id
	private int id;
	
	private String name;
	
	private String email;
	
	@OneToMany(mappedBy="customer")
	private List<Orders> orders;
	
	public Customers() {
		
	}
	
	public Customers(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + ", emial=" + email + "]";
	}

}
