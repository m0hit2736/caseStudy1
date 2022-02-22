package AssignDay16;

import java.util.*;
import java.util.function.Predicate;

class Emp{
	
	String ename;
	int salary;
	public Emp()
	{
		
	}
	public Emp(String ename,int salary) {
		this.salary=salary;
		this.ename=ename;
	}
	
	public String toString() {
		return ename+""+ salary;
	}
	
}
public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> ar=new ArrayList<Emp>();
		ar.add(new Emp("mohit",2456));
		ar.add(new Emp("ajay",6000));
		ar.add(new Emp("mayank",7780));
		ar.add(new Emp("anmol",5500));
		//Emp e=new Emp();
		for(Emp e:ar) {
		Predicate<Emp> p2=a->e.salary>7000;
		
		System.out.println(p2.test(e)); 
		}
	}

}
