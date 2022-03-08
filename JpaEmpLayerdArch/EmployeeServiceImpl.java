package com.kt.service;

import com.kt.dao.EmployeeDao;
import com.kt.dao.EmployeeDaoImpl;
import com.kt.entities.Employee;


public class EmployeeServiceImpl implements EmployeeService {

	
	private EmployeeDao dao;
	 
	public EmployeeServiceImpl()
	{
		dao= new EmployeeDaoImpl();
	}
	 
	@Override
	public void addEmployee(Employee employee) {
		
		   dao.beginTransaction();
            dao.addEmployee(employee);
            dao.commitTransaction();
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		dao.beginTransaction();
		dao.updateEmployee(employee);
		dao.commitTransaction();
		
	}

	@Override
	public void deleteEmployee(Employee employee) {
	dao.beginTransaction();
	dao.deleteEmployee(employee);
	dao.commitTransaction();
		
	}

	@Override
	public Employee findEmployeeById(int id) {
		//no need of transaction, it read option only
		Employee employee=dao.getEmployeeById(id);
		return employee;
	}

}
