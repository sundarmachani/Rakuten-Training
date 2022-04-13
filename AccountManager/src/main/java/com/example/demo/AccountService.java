package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

	List<Account> accounts = new ArrayList<>();
	@Autowired
	AccountRepository repository;

	void save(Account account) {
		repository.save(account);
		System.out.println("Account saved succesfully");

	}

	public List<Account> getAllAccounts() {
		return repository.findAll();

	}

}
