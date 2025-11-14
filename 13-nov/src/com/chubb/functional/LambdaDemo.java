package com.chubb.functional;

public class LambdaDemo {
	public static void main(String[] args) {
		Greet greet = (String name) -> System.out.println("Hello " + name + "!");
		Greet greetImpl = new GreetImpl();
		greetImpl.sayHello("Pariwesh");
		greet.sayHello("Aashish");
	}
}
