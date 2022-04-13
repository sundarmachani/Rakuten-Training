package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
	List<Order> orders = new ArrayList<>();
	
	void saveOrder(Order Order) {
		orders.add(Order);
	}
	public List<Order> getOrders() {
		return orders;
	}

}
