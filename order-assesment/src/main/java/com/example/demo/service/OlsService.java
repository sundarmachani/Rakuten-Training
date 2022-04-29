package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Order;
import com.example.demo.repository.OlsRepository;



@Service
public class OlsService {

	@Autowired
	OlsRepository repository;
	public void save(Order order) {
		repository.save(order);
		System.out.println("order saved");
		
	}

	public List<Order> getAllOrders() {
		return repository.findAll();
	}

	public Order searchOrderById(String id) {
		Optional<Order> order = repository.findById(id);	
			return order.get();
		}
	

	public List<Order> searchByCustomerId(int id) {
		return repository.findAll().stream().filter(order -> order.getCustomerId() == id).collect(Collectors.toList());
	}
	

}
