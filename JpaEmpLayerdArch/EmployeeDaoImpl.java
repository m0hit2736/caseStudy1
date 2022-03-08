package com.kt.dao;

import javax.persistence.EntityManager;

import com.kt.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private EntityManager entityManager;

	public EmployeeDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
	}

	@Override
	public void addEmployee(Employee employee) {
	
		entityManager.persist(employee);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		entityManager.merge(employee);

	}

	@Override
	public void deleteEmployee(Employee employee) {
		entityManager.remove(employee);

	}

	@Override
	public void commitTransaction() {
	entityManager.getTransaction().commit();
	}

	@Override
	public void beginTransaction() {
	entityManager.getTransaction().begin();
	}

}
