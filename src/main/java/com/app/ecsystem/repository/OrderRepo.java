package com.app.ecsystem.repository;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.ecsystem.model.Orders;

@Repository
public class OrderRepo {
	
	@Autowired
	private EntityManager em;
	
	public Orders createOrder(Orders ord) {
		em.persist(ord);
		return ord;
	}
	
	public List<Orders> getOrderByCustomer(int id){
		
		List<Orders> customerOrder = em.createQuery("select ord from Orders ord", Orders.class).getResultList();
		customerOrder.stream().filter(orders -> orders.getId() == id).collect(Collectors.toList());
		return customerOrder;
		
	}

}
