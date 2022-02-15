package AssignDay12;
import java.util.*;  
public class HashSetEg {
	
	  
	 public static void main(String args[]){  
	  //Creating HashSet and adding elements  
	    HashSet<Integer> set=new HashSet();  
	    
	    for(int i=1;i<=10;i++)
	    {
	    	set.add(i);
	    }
	           set.add(11);    
	           set.add(12);    
	           set.add(13);   
	           set.add(14);  
	           set.add(15); 
	           
	           Iterator<Integer> i=set.iterator();  
	           while(i.hasNext())  
	           {  
	           System.out.println(i.next());  
	           }  
	 }  
	}  

