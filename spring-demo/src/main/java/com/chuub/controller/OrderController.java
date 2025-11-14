package com.chuub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chuub.request.Order;

import jakarta.validation.Valid;

@RestController
public class OrderController { //receive http request
	@GetMapping("/order") //path
	String getOrder() {
		return "hello";
	}
	
	@PostMapping("/order") //path
	Order saveOrder(@RequestBody @Valid Order order) {
		return order;
	}
}
