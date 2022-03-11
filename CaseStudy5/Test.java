package com.pizzamanagement.UI;



import com.pizzamanagement.model.Pizza;
import com.pizzamanagement.service.PizzaService;
import com.pizzamanagement.service.PizzaServiceImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PizzaService service= new PizzaServiceImpl();
Pizza pizza= new Pizza();
	
// add data in table 
		Pizza pizza1= new Pizza(111, "Margreta", 132, "Tonk Fatak");
		service.addPizza(pizza1);
		
		Pizza pizza2= new Pizza(112, "Normal", 100, "Durgapura");
		service.addPizza(pizza2);
		
		Pizza pizza3= new Pizza(113, "Vegis", 117, "Jagatpura");
		service.addPizza(pizza3);
		
		pizza=service.findPizzaByPNo(112);
		System.out.println("id:" +pizza.getPizzaNo());
		System.out.println("name :"+pizza.getPizzaType());
		System.out.println("salary :"+pizza.getPizzaPrice());
		
/*
//update data
		pizza=service.findPizzaByPNo(111);
		
		pizza.setPizzaPrice(137);
		pizza=service.findPizzaByPNo(111);
		
		System.out.println("price of pizza updated :"+pizza.getPizzaPrice());
		//delete data
		service.deletePizza(pizza);
		
		System.out.println("the Pizza is deleted succefully from Your Order"); 
	*/
	}

}
