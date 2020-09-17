package com.app.ecsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ecsystem.model.Items;
import com.app.ecsystem.service.ItemsService;

@RestController
@RequestMapping("/items")
public class ItemController {
	
	@Autowired
	private ItemsService itemsService;
	
	/**
	 * This method is used to search the available items 
	 */
	@GetMapping("/products")
	public List<Items> getAvailableItems(){
		return 	itemsService.getAvailableItems();	
	}

}
