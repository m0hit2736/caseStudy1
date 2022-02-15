package AssignDay12;
import java.util.*;  

public class LikedListEG {
	
	 public static void main(String args[]){  
	 //Creating HashSet and adding elements  
	        LinkedHashSet<Integer> set=new LinkedHashSet();  
	        for(int i=1;i<=10;i++)
		    {
		    	set.add(i);
		    }  
	               set.add(11);  
	               set.add(12);  
	               Iterator<Integer> i=set.iterator();  
	               while(i.hasNext())  
	               {  
	               System.out.println(i.next());  
	               }  
	 
	}  
}
