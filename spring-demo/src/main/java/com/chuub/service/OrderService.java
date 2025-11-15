package com.chuub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chuub.repository.OrderRepository;
import com.chuub.request.Order1;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrderService {//to implement businessRules/ Logic
	@Autowired
	OrderRepository orderRepository;
	public void insertOrder(Order1 order) {
		orderRepository.save(order);
		log.debug(order.toString());
	}
}
