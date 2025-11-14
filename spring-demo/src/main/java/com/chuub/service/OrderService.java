package com.chuub.service;

import org.springframework.stereotype.Service;

import com.chuub.request.Order;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrderService {//to implement businessRules/ Logic
	public void insertOrder(Order order) {
		log.debug(order.toString());
	}
}
