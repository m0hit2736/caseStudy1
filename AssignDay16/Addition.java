package AssignDay16;

import java.util.function.Function;
interface addable{
	void add(int a,int b);
}
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addable ad1=(a,b)->System.out.print(a+b); 
		ad1.add(3,8);

		
	}

}
