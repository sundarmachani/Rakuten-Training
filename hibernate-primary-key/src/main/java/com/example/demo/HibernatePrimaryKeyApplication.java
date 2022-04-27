package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernatePrimaryKeyApplication implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository employeeRespository;

	public static void main(String[] args) {
		SpringApplication.run(HibernatePrimaryKeyApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		employeeRespository.deleteAllInBatch();
		Employee employee = new Employee(new EmployeeId("M-123", "R-776"),
				"John players",
				"johnplayers@test.com",
				"+919999999912");
		
		employeeRespository.save(employee);
		employeeRespository.findById(new EmployeeId("M-123", "R-776"));
		employeeRespository.findByEmployeeIdCompanyId("R-776");
	}
}
