package com.app.ecsystem.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ecsystem.model.Items;
import com.app.ecsystem.repository.ItemsRepo;
import com.app.ecsystem.service.ItemsService;

@Service
@Transactional
public class ItemsServiceImplementation implements ItemsService {
	
	@Autowired
	private ItemsRepo repo;

	@Override
	public List<Items> getAvailableItems() {
		return repo.getAvailableItems();
	}

}
