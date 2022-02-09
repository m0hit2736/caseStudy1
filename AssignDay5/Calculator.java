
public class Calculator {
	private static void add(int a, int b) {
		// TODO Auto-generated method stub
				System.out.println(a+b);
		}
	private static int sub(int a, int b) {
		return a-b;
	}
	private int mul(int a ,int b)
	{
		return a*b;
	}
	private void div(int a,int b)
	{
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5;
int b=6;
Calculator c=new Calculator();
Calculator.add(a,b);
int sum=Calculator.sub(a, b);
int mul=c.mul(a, b);
c.div(a, b);
System.out.println(sum);
System.out.println(mul);
	}

}
