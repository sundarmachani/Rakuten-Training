package com.rakuten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	List<User> users = new ArrayList<>();
	@Autowired
	UserRepository repository;

	Integer save(User user) {
		repository.save(user);
		return user.getId();

	}

	public List<User> getAllUsers() {
		return repository.findAll();

	}

	public List<User> getUserByName(String name) {
		List<User> filteredUsers = users.stream().filter((user) -> user.getName().equals(name))
				.collect(Collectors.toList());
		return filteredUsers;
	}
}
