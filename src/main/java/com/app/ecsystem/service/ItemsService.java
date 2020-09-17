package com.app.ecsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.ecsystem.model.Items;

@Service
public interface ItemsService {
	
	public List<Items> getAvailableItems();

}
