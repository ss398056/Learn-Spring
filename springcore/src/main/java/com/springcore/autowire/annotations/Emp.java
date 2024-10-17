package com.springcore.autowire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//Autowiring using annotations
public class Emp {
	@Autowired
	@Qualifier("address2")			//This annotation use for remove multiple bean found exception
	private Address address;
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}

	
	public Address getAddress() {
		return address;
	}
	
	
	public void setAddress(Address address) {
		System.out.println("Inside setter");
		this.address = address;
	}
	
	
	public Emp(Address address) {
		super();
		System.out.println("Inside constructor");
		this.address = address;
	}


	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	

}
