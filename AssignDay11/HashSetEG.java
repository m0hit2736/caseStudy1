package AssignDay11;
import java.util.*;
public class HashSetEG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set=new HashSet();  
        set.add("mohit");    
        set.add("Div");    
        set.add("ravi");   
        set.add("ajay");  
        set.add("mayank");  
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }  
        
        class Myclass implements Comparator{

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return ((String) o1).compareTo((String) o2);
			}
        	
        }
}  
	}


