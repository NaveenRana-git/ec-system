package com.app.ecsystem.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Orders{
	
	@Id
	private int id;
	
	@Column(nullable=false)
	private int quantity;
	
	@CreationTimestamp
    private LocalDateTime orderedDate;
	
	@ManyToOne()
	private Items item;
	
	@ManyToOne()
	private Customers customer;
	
	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

	public Items getItem() {
		return item;
	}

	public void setFood(Items item) {
		this.item = item;
	}

	protected Orders() {
		super();
	}
	
	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDateTime getOrdersedDate() {
		return orderedDate;
	}

	public void setCreatedDate(LocalDateTime orderedDate) {
		this.orderedDate = orderedDate;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + id + ", quantity=" + quantity + ", orderedDate=" + orderedDate + "]";
	}
	
}
