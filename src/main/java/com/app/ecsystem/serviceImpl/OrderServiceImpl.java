package com.app.ecsystem.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ecsystem.model.Orders;
import com.app.ecsystem.repository.OrderRepo;
import com.app.ecsystem.service.OrdersService;

@Service
@Transactional
public class OrderServiceImpl implements OrdersService {
	
	@Autowired
	private OrderRepo ordRepo;

	@Override
	public Orders CreateOrder(Orders ord) {
		return ordRepo.createOrder(ord);
	}
	
	public List<Orders> getOrderByCustomer(int id){
		return ordRepo.getOrderByCustomer(id);
	}

}
