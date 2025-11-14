package com.chuub.request;

import jakarta.validation.constraints.Min;

public class Order {
	private String item;
	@Min(value = 1)
	private float price;
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
