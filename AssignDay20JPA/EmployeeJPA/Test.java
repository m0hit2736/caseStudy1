package com.employeeJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("Mohit");
		
		EntityManager entity=factory.createEntityManager(); 
		
		
		Employee emp= new Employee(133, "mohit", 10000, "jpr");
		
		entity.getTransaction().begin();
		
		entity.persist(emp);
		
		Employee emp2=entity.find(Employee.class, 133);
		//System.out.println(emp); 
		
emp2.setEmpAdd("banglore");
		emp2.setEmpname("ravi");
		emp2.setEmpsal(80000);
		
		entity.merge(emp);
		//entity.remove(emp);
		
		Employee emp1=entity.find(Employee.class, 133);
		System.out.println(emp1);
		//entity.getTransaction().commit();
		
	}

}