package com.app.ecsystem.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.ecsystem.model.Items;

@Repository
public class ItemsRepo {
	
	@Autowired
	private EntityManager em;
	
	public List<Items> getAvailableItems(){
		TypedQuery<Items> itemsQuery=em.createQuery("select i from Items i order by i.price asc" ,Items.class);
		return itemsQuery.getResultList();
	}

}
