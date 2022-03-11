package com.pizzamanagement.service;


import com.pizzamanagement.Dao.PizzaDao;
import com.pizzamanagement.Dao.PizzaDaoImpl;
import com.pizzamanagement.model.Pizza;

public class PizzaServiceImpl implements  PizzaService {

	private PizzaDao dao;
	 
	public PizzaServiceImpl()
	{
		dao= new PizzaDaoImpl();
	}
	 
	//method for adding pizza
	@Override
	public void addPizza(Pizza pizza) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
        dao.addPizza(pizza);
        dao.commitTransaction();
	
	}
//method for updating row
	@Override
	public void updatePizza(Pizza pizza) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updatePizza(pizza);
		dao.commitTransaction();
	}

	@Override
	//removing specific number of pizza order
	public void deletePizza(Pizza pizza) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.deletePizza(pizza);
		dao.commitTransaction();
	}

	@Override
	public Pizza findPizzaByPNo(int pNo) {
		// TODO Auto-generated method stub
		Pizza pizza=dao.getPizzaByPNo(pNo);
		
		return pizza;
	}

}
