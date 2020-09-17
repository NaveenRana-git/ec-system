package com.app.ecsystem.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.ecsystem.model.Customers;

@Repository
public class CustomerRepo {
	@Autowired
	private EntityManager em;
	
	
	public List<Customers> customersList(){
		TypedQuery<Customers> cusList = em.createQuery("select cus from Customers cus", Customers.class);
		return cusList.getResultList();
	}
	
	public Customers createUser(Customers cust) {
		em.persist(cust);
		return cust;
		
	}

}
