package com.app.ecsystem.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ecsystem.model.Customers;
import com.app.ecsystem.repository.CustomerRepo;
import com.app.ecsystem.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepo cusRepo;
	
	@Override
	public Customers createUser(Customers cus) {
		return cusRepo.createUser(cus);
	}

}
