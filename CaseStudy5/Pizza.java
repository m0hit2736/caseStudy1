package com.pizzamanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity // createing entity
public class Pizza {
	@Id //primary key
	private int pizzaNo;
	@Column(length=15)
	private String pizzaType;
	private int pizzaPrice;
	@Column(length=15)
	private String deliveryAddrs;
	public int getPizzaNo() {
		return pizzaNo;
	}
	public void setPizzaNo(int pizzaNo) {
		this.pizzaNo = pizzaNo;
	}
	public String getPizzaType() {
		return pizzaType;
	}
	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}
	public int getPizzaPrice() {
		return pizzaPrice;
	}
	public void setPizzaPrice(int pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}
	public String getDeliveryAddrs() {
		return deliveryAddrs;
	}
	public void setDeliveryAddrs(String deliveryAddrs) {
		this.deliveryAddrs = deliveryAddrs;
	}
	public Pizza()
	{
		
	}
	
	public Pizza(int pizzaNo, String pizzaType, int pizzaPrice, String deliveryAddrs) {
		super();
		this.pizzaNo = pizzaNo;
		this.pizzaType = pizzaType;
		this.pizzaPrice = pizzaPrice;
		this.deliveryAddrs = deliveryAddrs;
	}
	@Override
	public String toString() {
		return "Pizza [pizzaNo=" + pizzaNo + ", pizzaType=" + pizzaType + ", pizzaPrice=" + pizzaPrice
				+ ", deliveryAddrs=" + deliveryAddrs + "]";
	}
	
	
}
