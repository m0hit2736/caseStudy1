package CaseStudy3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Database {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer,Product> map=new LinkedHashMap<Integer,Product>();
		ProductDetail db=new ProductDetail();
		db.addProduct(map);
		db.addProduct(map);
		db.addProduct(map);
		db.addProduct(map);
		db.deleteProduct(map);
		db.updateProduct(map);
		Product p=new Product();
		db.getProduct(map);
		db.getProductAll(map);
		
		
			 
	}

	
	}


