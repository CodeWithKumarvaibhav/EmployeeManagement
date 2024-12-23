package com.avsoft.employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avsoft.employee.entity.Employee;
import com.avsoft.employee.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepo employeeRepo;
	
	@Override
	public void saveEmp(Employee emp) {
		employeeRepo.save(emp);
		
	}

	@Override
	public void deleteEmp(int id) {
	
		employeeRepo.deleteById(id);
		System.out.println("Hello");
	}

	@Override
	public Employee viewEmployee(int id) {
		
		Optional<Employee> optionalEmployee = employeeRepo.findById(id);
		
		if(optionalEmployee.isPresent()) {
			return optionalEmployee.get();
		}
		return null;
	}

}
