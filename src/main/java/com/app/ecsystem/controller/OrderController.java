package com.app.ecsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ecsystem.controller.exceptions.UserErrorResponse;
import com.app.ecsystem.controller.exceptions.UserNotFoundException;
import com.app.ecsystem.model.Customers;
import com.app.ecsystem.model.Orders;
import com.app.ecsystem.repository.CustomerRepo;
import com.app.ecsystem.service.OrdersService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private CustomerRepo cusRepo;
	
	@Autowired
	private OrdersService ordService;
	
	/**
	 * This method creates order only when the user is registered 
	 * else this method returns error message showing not a registered user
	 */
	@PostMapping("/{id}/placeOrder")
	public Orders createOrder(@PathVariable int id ,@RequestBody Orders order) {
		boolean isExisting = false;
		List<Customers> customerList =  cusRepo.customersList();
		for(Customers cus:customerList) {
			if(cus.getId() == id) {
				isExisting = true;
				break;
			}
		}
		if(isExisting) {
			return ordService.CreateOrder(order);
		}else {
			throw new UserNotFoundException("user not registered, please create user: " +id);
		}
		
	}
	
	/**
	 * This method returns all the orders placed
	 * by a particular customer
	 */
	@GetMapping("/orders/{customerId}")
	public List<Orders> getOrderByCustomer(@PathVariable int customerId){
		return ordService.getOrderByCustomer(customerId);
	}
	
	/**
	 * This is custom exception method which will be thrown
	 * when non-registered user try to place order
	 */
	@ExceptionHandler
	public ResponseEntity<UserErrorResponse> handeleException(UserNotFoundException exp){
		UserErrorResponse res = new UserErrorResponse();
		res.setStatus(HttpStatus.NOT_FOUND.value());
		res.setMessage(exp.getMessage());
		res.setTimestamp(System.currentTimeMillis());
		return new ResponseEntity<>(res,HttpStatus.NOT_FOUND);
	}
	
}
