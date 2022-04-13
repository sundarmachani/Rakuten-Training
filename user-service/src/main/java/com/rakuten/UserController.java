package com.rakuten;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	Integer saveUser(@RequestBody User user) {
		System.out.println(user.getName());
		System.out.println(user.getAge());
		return service.save(user);
	}
	
	@GetMapping("/{name}")
	List<User> getUsersByName(@PathVariable String name) {
		System.out.println(name);
		return service.getUserByName(name);
//		if(name.isEmpty() || name.isBlank()) {
//			throw new IllegalArgumentException("Name should not be empty");
//			
		}
//		System.out.println(name);
//		List<User> filteredUsers = users.stream().filter((user) -> user.getName().equals(name)).collect(Collectors.toList());
//		return filteredUsers;
//	
//	}
//	
//	@GetMapping("/age/{age}")
//	List<User> getUsersByAge(@PathVariable int age) {
//		if(age <0) {
//			throw new IllegalArgumentException("Age cannot be Negative"+age);
//		}
//		System.out.println(age);
//		List<User> filteredUsers = users.stream().filter((user) -> user.getAge() == age).collect(Collectors.toList());
//		return filteredUsers;
//		}
}



