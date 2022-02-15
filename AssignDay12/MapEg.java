package AssignDay12;
import java.util.*;  
public class MapEg {
	
	  
	 public static void main(String args[]){  
	   HashMap<Integer,String> map=new HashMap<Integer,String>();
	   map.put(1,"Mohit");    
	   map.put(2,"mayank");    
	   map.put(3,"ravi");   
	   map.put(4,"ajay");   
	       
	     Set s=map.keySet();
	  System.out.println("Using Keyset"+s);
	  
	  
	
			Set<Map.Entry<Integer, String>> key = map.entrySet();
			System.out.println(" using entrySet() : "+key);
			System.out.println();

			System.out.println("Values:");
			for(Map.Entry m:key)  
		     {  
		        System.out.println(m.getValue());   
		     }   
		}
	

	}  
	
