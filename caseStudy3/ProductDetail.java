package CaseStudy3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import CaseStudy3.Database;
import CaseStudy3.Product;

public class ProductDetail {
public void addProduct(LinkedHashMap<Integer,Product> map) {
		
		Product pd=new Product();
		pd.setID();
		int pID=pd.getID();
		pd.setpName();
		String pName=pd.getpName();
		pd.setPAmount();
		int pAmount=pd.getPAmount();
		pd.setpCode();
		int pCode=pd.getpcode();
		pd.setpAddrs();
		String pAddrs=pd.getpaddrs();
		pd.setPinCode();
		int pPinCode=pd.getPinCode();
		map.put(pID,pd);
		
}
	
	public void updateProduct(LinkedHashMap<Integer,Product> map)
	{
		ProductDetail  db=new ProductDetail();
		db.addProduct(map);
		
	}
	public void deleteProduct(LinkedHashMap<Integer,Product> map)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the product id which you want to remove:");
		int Pid=sc.nextInt();
		map.remove(Pid);
	}
	public void getProduct(LinkedHashMap<Integer, Product> map) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int pId=sc.nextInt();
		Product p=map.get(pId);
		System.out.println(p.productID+p.productName+p.getPAmount()+p.productCode+p.productAddrs+p.productPinCode);
	}

	 void getProductAll(LinkedHashMap<Integer,Product> map) {
		// TODO Auto-generated method stub
		for(Map.Entry<Integer, Product> entry:map.entrySet()){ 
			
			 int key=entry.getKey();  
		        Product p=entry.getValue();  
		        System.out.println(key+" Details:");  
		           
	       System.out.println(p.productID+p.productName+p.getPAmount()+p.productCode+p.productAddrs+p.productPinCode); 
			  }  
	}
}

