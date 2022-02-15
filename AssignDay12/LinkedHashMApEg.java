package AssignDay12;
import java.util.*;
public class LinkedHashMApEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();  
		 map.put(1,"Mohit");    
		   map.put(2,"mayank");    
		   map.put(3,"ravi");   
		   map.put(4,"ajay");   
		  
		  
		for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
	}

}
