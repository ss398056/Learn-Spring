package com.springcore.lifecycle;

//Life cycle using xml configuration like init-method="method_name" destroy-method="method_name"
public class Mobile {
	private String brand;
	private String model;
	private double price;
	
	public Mobile() {
		super();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}
	
	
	public void start() {
		System.out.println("This is init() method using xml config");
	}
	
	public void end() {
		System.out.println("This is destroy() method using xml config");
	}
}
