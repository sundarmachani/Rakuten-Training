package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	List<Order> orders = new ArrayList<>();
	@Autowired
	OrderRepository orderRepository;
	
	String saveOrder(Order order) {
		orderRepository.save(order);
		return order.getName();
	}
	public List<Order> getOrders() {
		return orderRepository.findAll();
	}
}
