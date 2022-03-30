package com.gcu.business;

import java.util.List;

import com.gcu.model.OrderModel;

public interface OrdersBusinessServiceInterface {
	
	// Methods that implemented classes will contain
	public void test();
	
	public List<OrderModel> getOrders(); // Mimic a database

	public List<OrderModel> findAll();
	
	void init();

	void destroy();

}
