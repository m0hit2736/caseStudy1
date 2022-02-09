
public class Product {
	String pName="";
	int pid;
	Product()
	{
		pName="Ice";
		pid=4;
	}
	public static void main(String args[])
	
	{
		Product p=new Product();
		System.out.print(p.pName+" "+p.pid);
	}
}
