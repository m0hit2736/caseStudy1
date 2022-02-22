package AssignDay16;

import java.util.ArrayList;
import java.util.Collections;

class eg{
	int eno;
	String ename;
	
	public eg(int eno,String ename) {
		this.eno=eno;
		this.ename=ename;
	}
	
	public String toString() {
		return eno+""+ ename;
	}
	
}
public class Employee{
public static void main(String[] args) {
	
	
	ArrayList<eg> ar= new ArrayList<eg>();
	
	ar.add(new eg(123,"mohit"));
	ar.add(new eg(124,"ajay"));
	ar.add(new eg(125,"mayank"));
	ar.add(new eg(126,"anmol"));
	
	System.out.println(ar);
	
	
	Collections.sort(ar,(e1,e2)->(e1.eno>e2.eno)?1:(e1.eno>e2.eno)?-1:0);
	
	System.out.println(ar);
	
}
}