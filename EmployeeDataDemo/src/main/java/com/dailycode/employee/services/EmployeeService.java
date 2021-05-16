package com.dailycode.employee.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycode.employee.entity.Employee;
import com.dailycode.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository empRepo;
	
	public Employee addEmployee(Employee emp) {
		empRepo.save(emp);
		return emp;
	}
}
