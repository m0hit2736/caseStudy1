package com.empJPQL;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Client {

		public static void main(String args[])
		{
			
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("jpqleg");
			EntityManager entity=factory.createEntityManager();
			entity.getTransaction().begin();	
			
			
			
			 Employee e= new Employee(100, "mohit", 10000, "jpr");
			 Employee e1= new Employee(101, "ravi", 15000, "bagLore");
			Employee e2= new Employee(102, "ajay", 13000, "jaipur");
			
			
			//inserting values
			entity.persist(e);
			entity.persist(e1);
			entity.persist(e2);	
			
			
		/*
			
			//fetching data from the database
			TypedQuery<Employee> tq=entity.createQuery("select e from Employee e", Employee.class);
		
			List<Employee> list=tq.getResultList();
					int count=1;
			for(Employee s:list) 
				{
				System.out.println("for Employee:"+count);
							System.out.println(s.getEmpid());
							System.out.println(s.getEmpname());
							System.out.println(s.getEmpsal());
			count++;
				}
			System.out.println("data is fetched succesfully");
*/
		//updating data	
			
		      javax.persistence.Query result=entity.createQuery("update Employee set empsal= empsal+50000 where empsal>10000");
		          
	            int rows=  result.executeUpdate();
		      System.out.println(rows);
		      

		//delete data from databse
		         /*
			             javax.persistence.Query result1 = entity.createQuery("delete from  Employee where empsal>10000");
		                        result1.executeUpdate();
		          */    

		//selecting row
			
		           javax.persistence.Query result11=entity.createQuery("select MAX(e.empsal) FROM Employee e");
		           
		                   int maxsal= (int) result11.getSingleResult();
	                   
			                   System.out.println(maxsal);
		                   
			                   
			                   
			                   
			entity.getTransaction().commit();
			
			entity.close();
			factory.close();
			
		}
}
