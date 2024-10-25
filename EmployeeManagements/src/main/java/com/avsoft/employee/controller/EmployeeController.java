package com.avsoft.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.avsoft.employee.entity.Employee;
import com.avsoft.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("/employee/{id}")
	public Employee viewEmployee(@PathVariable("id") int id) {
		return employeeService.viewEmployee(id);
	}

}
