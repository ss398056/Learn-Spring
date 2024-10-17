package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


//Note : If you are using java version less than java version 9 you can use annotations directly. If you are using greater 9 version you have to add dependency in pom.xml file for that annotations.

//Life cycle method using annotations like:-
public class Laptop {
	private double price;
	
	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [price=" + price + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("This is init() method using annotations");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("This is destroy() method using annotations");
	}

}
