package AssignDay13;
import java.util.*;
public class ArrayListGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr=new ArrayList();
		arr.add("Mohit");
		arr.add(45);
		arr.add(45.5f);
		String s=(String)arr.get(0);
		Integer i=(Integer)arr.get(1);
		Float d=(Float)arr.get(2);
		System.out.println(s+""+i+""+d);
	}

}
