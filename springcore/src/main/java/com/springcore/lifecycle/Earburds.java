package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//Life cycle method using interfaces like :-  InitializingBean, DisposableBean
public class Earburds implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Earburds() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Earburds [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("This is same as init() method using interface");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("This is destroy() method using interface");
	}
	
	
}
