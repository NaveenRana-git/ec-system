package com.app.ecsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.ecsystem.model.Customers;
import com.app.ecsystem.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService cust;
	
	/**
	 * This method is used to create a new user
	 */
	@PostMapping("/createUser")
	public Customers createUser(@RequestBody Customers cus) {
		return cust.createUser(cus);
	}
	
}
