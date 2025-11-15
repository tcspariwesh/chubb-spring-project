package com.chuub.request;

import org.hibernate.validator.constraints.Range;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
@Entity
public class Order1 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@NotBlank
	private String item;
	@Min(value = 1)
	private float price;
//	@Min(value = 1, message = "quantity > 0 ")
	@Range(min = 1, max = 10)
	private int quantity;
//	Address address;

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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
