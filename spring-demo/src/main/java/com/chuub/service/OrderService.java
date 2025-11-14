package com.chuub.service;

import org.springframework.stereotype.Service;

import com.chuub.request.Order;

@Service

public class OrderService {//to implement businessRules/ Logic
	public void insertOrder(Order order) {
		System.out.println(order);
	}
}
