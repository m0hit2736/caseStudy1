package AssignDay11;
import java.util.*;
public class ArrayListEG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList arrlist = new ArrayList();
		  ArrayList<Integer> ar=new ArrayList<Integer>();
		  ar.add(33);
		  ar.add(32);
		  ar.add(36);
		  ar.add(38);
		  ar.add(53);
		  ar.add(73);
		  ar.add(30);
		  Iterator itr=ar.iterator();//getting the Iterator  
		  while(itr.hasNext()){
			  Integer a=(Integer) itr.next();
			  if(a%2==0)
			  {
				  System.out.println(a);
			  }
		  }

		  
	        // use add() method to add elements in the list
	        arrlist.add(15);
	        arrlist.add(20.2f);
	        arrlist.add("Mohit");
	        arrlist.add(null);
	        for(Object a: arrlist)
	        {
	        	System.out.println(a);
	        }
	}

}
