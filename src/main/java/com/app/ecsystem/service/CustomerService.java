package com.app.ecsystem.service;

import org.springframework.stereotype.Service;

import com.app.ecsystem.model.Customers;

@Service
public interface CustomerService {
	
	public Customers createUser(Customers cus);
}
