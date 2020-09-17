package com.app.ecsystem.service;

import java.util.List;

import com.app.ecsystem.model.Orders;

public interface OrdersService {
	
	public Orders CreateOrder(Orders ord);
	
	public List<Orders> getOrderByCustomer(int id);

}
