package com.demo.hack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.hack.model.Employee;

@RestController
public class EmployeeController {

	@GetMapping("/")
	public String getEmployee() {
		return "Hello World";
	}
	
	@GetMapping("/Add")
	public String addEmployee(Employee employee) {
		
	}
}
