package com.pizzamanagement.Dao;

import javax.persistence.EntityManager;


import com.pizzamanagement.model.Pizza;

public class PizzaDaoImpl implements PizzaDao {

	private EntityManager entityManager;
	
	public PizzaDaoImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}
	@Override
	public void addPizza(Pizza pizza) {
		// TODO Auto-generated method stub
		entityManager.persist(pizza);
	}

	@Override
	public void updatePizza(Pizza pizza) {
		// TODO Auto-generated method stub
		entityManager.merge(pizza);

	}

	@Override
	public void deletePizza(Pizza pizza) {
		// TODO Auto-generated method stub
		entityManager.remove(pizza);
	}

	@Override
	public Pizza getPizzaByPNo(int pNo) {
		// TODO Auto-generated method stub
		Pizza pizza = entityManager.find(Pizza.class, pNo);
		return pizza;
		
	}

	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
	}

}
