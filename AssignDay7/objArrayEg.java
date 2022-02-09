package AssignDay7;

class objArrayEg{
	   public static void main(String args[]){
	     
	    Employee[] obj = new Employee[2] ;
	 
	     
	     obj[0] = new Employee(100,"ABC");
	     obj[1] = new Employee(200,"XYZ");
	 
	    
	     System.out.println("Employee Object 1:");
	     obj[0].showData();
	     System.out.println("Employee Object 2:");
	     obj[1].showData();
	  }
	}
	
	class Employee{
	  int empId;
	  String name;
	  
	  Employee(int eid, String n){
	     empId = eid;
	     name = n;
	  }
	public void showData(){
	   System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
	   System.out.println();
	 }
	}