package com.client;

import com.kt.entities.Employee;
import com.kt.service.EmployeeService;
import com.kt.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		EmployeeService service= new EmployeeServiceImpl();
		
		Employee employee= new Employee(111, "mohit", 500000, "jpr");
		
		service.addEmployee(employee);
	
		
		//added one record to the table
	/*	
		employee=service.findEmployeeById(111);
		System.out.println("id:" +employee.getEid());
		System.out.println("name :"+employee.getEname());
		System.out.println("salary :"+employee.getEsal());
	*/	
//update
		employee=service.findEmployeeById(111);
		employee.setEname("tarun");
		employee.setEadd("hyd");
		employee.setEsal(20000);
		
		service.updateEmployee(employee);
//		
		 employee=service.findEmployeeById(111);
	System.out.println("updated id:"+employee.getEname());
		System.out.println("updated id:"+employee.getEadd());
		System.out.println("updated id:"+employee.getEsal());
		
		
//delete
/*		service.deleteEmployee(employee);
	System.out.println("end of program");
	*/	
	}
}
