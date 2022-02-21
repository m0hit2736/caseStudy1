package EmployeeManage;
import java.util.*;
import java.util.Map.Entry; 

public class Client {
	

	public static void main(String[] args) {
		//for storing data
		HashMap<Integer,Employee> employee=new HashMap<Integer,Employee>();
		
		int eid=100;
		
		while(true) {
			
			System.out.println("Employee managemant Application");
			System.out.println("1.Add Employee");
			System.out.println("2.Update Employee");
			System.out.println("3.get Employee");
			System.out.println("4.get all Employee");
			System.out.println("5.Delete Employee");
			//getting choice from user 
			Scanner sc= new Scanner(System.in);
			
			int option=sc.nextInt();
			
			switch(option) {
			
			case 1:
				System.out.println("Enter to add Employee details");
				System.out.println("Enter Employee name");
				       String eName=sc.nextLine();
				      sc.nextLine();
				System.out.println("Enter Employee Sallary");
				       int eSallary=sc.nextInt();
				     
				System.out.println("Enter Employee code");
				     int eCode=sc.nextInt();
				
				System.out.println("Enter Employee address");
				       String eAddrs=sc.next();
				System.out.println("Enter Employee email address");
				    String eEmail=sc.nextLine();
				   //sc.nextLine();
				  
				    Employee e= new Employee(eName, eSallary, eCode, eAddrs, eEmail);
				 System.out.println(e);
				 employee.put(++eid, e);
				 
				 System.out.println("Employee addedd succsfully :"+eid);
				     
				break;
	       case 2:
	    	   
	    	   System.out.println("Enter to Update the Employee details");
	    	   
	    	   System.out.println("ENTER Employee ID TO UPDATE");
	    	              int eid1=sc.nextInt();
	    	     System.out.println("Enter Employee name");
				       String eName1=sc.nextLine();
				       sc.nextLine();
				System.out.println("Enter Employee amount");
				       int eSallary1=sc.nextInt();
				System.out.println("Enter Employee code");
				     int eCode1=sc.nextInt();
				System.out.println("Enter Employee address");
				       String eAddrs1=sc.nextLine();
				       sc.nextLine();
				System.out.println("Enter Employee email address");
				     String eEmail1=sc.nextLine();
				     sc.nextLine();
				     Employee e1= new Employee(eName1, eSallary1, eCode1, eAddrs1, eEmail1);
				
				    		employee.put(eid1, e1);
				     
				     System.out.println("Employee updated suscfully :"+eid1);
				break;
	       case 3:
	    	   System.out.println("Enter id to get the Employee details");
	    	      int eid2=sc.nextInt();
	 
	    	      Employee eobj=employee.get(eid2);
	    	      System.out.println(eobj);
	    	      
				break;
	       case 4:
	    	   Set<Entry<Integer,Employee>> result=employee.entrySet();
	    	   Iterator<Entry<Integer,Employee>> itr=result.iterator();
	    	   System.out.println(result);
	    	   while(itr.hasNext()) {
	    		   Entry<Integer,Employee> finalResult=itr.next();
	    		   
	    		   System.out.println(finalResult.getKey()+"  "+finalResult.getValue());
	    		   
	    	   }
				break;
	       case 5:
	    	   
	    	   System.out.println("Enter id to delete Employee");
	    	   int eid3= sc.nextInt();
	    	   
	    	   Employee eobj1=employee.remove(eid3);
	    	   System.out.println("Employee deleted :"+eid3);
				
				break;
			
			
			default:
				System.out.println("wrong selection");
				
			
			}
			
			
		}
		
	}
	}

