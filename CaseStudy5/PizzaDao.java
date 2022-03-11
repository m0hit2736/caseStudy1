package com.pizzamanagement.Dao;

import com.pizzamanagement.model.Pizza;

public interface PizzaDao {

	
	
	
	void addPizza(Pizza pizza);
	
	void updatePizza(Pizza pizza);
	
	void deletePizza(Pizza pizza);
	
	Pizza getPizzaByPNo(int pNo);
	void commitTransaction();
	
	void beginTransaction();
}
