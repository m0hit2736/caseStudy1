package AssignDay11;
import java.util.*;
public class treesetEg {
	 public static void main(String args[]){  
		 
		  TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("mohit");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		   
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  
}
