package com.chubb.functional;

public class GreetImpl implements Greet {
	@Override
	public void sayHello(String name) {
		System.out.println(name);
	}
}
