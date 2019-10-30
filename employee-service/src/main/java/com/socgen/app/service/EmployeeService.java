package com.socgen.app.service;

import java.util.List;

import com.socgen.app.model.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee employee);
	
	List<Employee> getAllEmployee();
}
