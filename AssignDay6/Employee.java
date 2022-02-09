package AssignDay6;

public class Employee {

	String Ename="";
	int eId;
	String eDepart;
	static String Company="ATCS";
	Employee()
	{
		Ename="Mohit";
		eId=36;
		eDepart="Java";
	}
	public void empDetails()
	{
		System.out.println("Company Name"+Company);
		System.out.println("Employee name"+Ename);
		System.out.println("eId"+ eId);
		System.out.println("Edepartmenr"+eDepart);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.empDetails();
	}

}
