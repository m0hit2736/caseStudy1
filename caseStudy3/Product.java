package CaseStudy3;
import java.util.*;
public class Product {
	public int productID;  
	public String productName; 
	public  int productAmount;
	public  int productCode;
	 public  String productAddrs; 
	  public  int productPinCode;
	   
	   Scanner sc=new Scanner(System.in);
	


	public void setID() {
		// TODO Auto-generated method stub
		 productID=sc.nextInt();
		
	}


	public int getID() {
		// TODO Auto-generated method stub
		return productID;
	}


	public void setpName() {
		// TODO Auto-generated method stub
		 productName=sc.next(); 
	}


	public String getpName() {
		// TODO Auto-generated method stub
		return productName;
	}


	public void setPAmount() {
		
		productAmount=sc.nextInt();
	}
	public int getPAmount()
	{
		return productAmount;
	}


	public void setpCode() {
		// TODO Auto-generated method stub
		productCode=sc.nextInt();
	}
	public int getpcode()
	{
		return productCode;
	}
	
	public void setpAddrs()
	{
		productAddrs=sc.nextLine();
		sc.nextLine();
	}
	public String getpaddrs()
	{
		return productAddrs;
	}
public void setPinCode()
{
	 productPinCode=sc.nextInt();
}
public int getPinCode()
{
	return productPinCode;
}
}
