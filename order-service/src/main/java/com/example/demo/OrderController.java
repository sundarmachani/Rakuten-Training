package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	String createOrder(@RequestBody Order order) {
		System.out.println(order.getName());
		System.out.println(order.getPrice());
		return orderService.saveOrder(order);
	}
	@GetMapping("/{name}")
	private void getOrder() {
		System.out.println("get order method is invoked");
		
	}
	private void speedShipping() {
		System.out.println("Your order is eligible for Speed Shipping");

	}
	private void normalShipping() {
		System.out.println("Your order is eligible for Normal shipping");

	}
	void shippingSpeed() {
		int price = 0;
		if(price  >= 100) {
			speedShipping();
		}
		else {
			normalShipping();
		}

	}
}
