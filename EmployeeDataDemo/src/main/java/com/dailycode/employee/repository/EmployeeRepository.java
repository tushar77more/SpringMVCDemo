package com.dailycode.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.dailycode.employee.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
