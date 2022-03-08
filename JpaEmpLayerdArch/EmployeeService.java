package com.kt.service;

import com.kt.entities.Employee;

public interface EmployeeService {
	
	void addEmployee(Employee employee);
	
	void updateEmployee(Employee employee);
	
	void deleteEmployee(Employee employee);
	
	Employee findEmployeeById(int id);

}
