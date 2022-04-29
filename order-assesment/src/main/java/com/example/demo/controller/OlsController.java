package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Order;
import com.example.demo.service.OlsService;



@RestController
@RequestMapping("/order")
public class OlsController {
	
	@Autowired
	OlsService olsservice;
	
	@PostMapping
	void saveOrder(@RequestBody Order order) {
		olsservice.save(order);
		
	}
	
	@GetMapping
	List<Order> getOrders() {
		return olsservice.getAllOrders();
	}
	
	@GetMapping("/get")
	Order getById(@RequestParam String id) {
		return olsservice.searchOrderById(id);
	}
	
	@GetMapping("/customerId")
	List<Order> getByCustomerId(@RequestParam int id) {
		return olsservice.searchByCustomerId(id);
	}
}
