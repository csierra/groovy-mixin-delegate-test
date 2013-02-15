package com.bizonos;

public class A {
	String name;

	public A(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("Hello " + this.name);
	}
}