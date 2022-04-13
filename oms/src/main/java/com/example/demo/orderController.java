package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Order")

public class orderController {
	
	
	@Autowired
	OrderService service;
	
	
	@PostMapping
	void saveOrder(@RequestBody Order order) {
		System.out.println(order.getOrderId());
		System.out.println(order.getPrice());
		System.out.println(order.getItem());
		service.saveOrder(order);
		
		
	}
	
	@GetMapping
	List<Order> fetchOrder() {
		return service.getOrders();
	}
}
