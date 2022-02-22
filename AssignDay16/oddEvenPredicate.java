package AssignDay16;

import java.util.function.Predicate;
public class oddEvenPredicate {
public static void main(String args[])
{
	Predicate<Integer> p1=i->i%2==0;

	System.out.println(p1.test(45)); 
	
	Predicate<String> p2=a->a.length()>5;
	System.out.println(p2.test("Mohitgupta")); 
}


}