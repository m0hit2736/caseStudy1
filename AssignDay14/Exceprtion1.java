package AssignDay14;
import java.util.*;
import java.lang.*;
public class Exceprtion1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		try {
			 int z=a/b;
			 System.out.println(z);
		}
		catch(Exception e){
			System.out.println("Divide by 0 exception");
		}
		System.out.println("Moht");
	}

}
