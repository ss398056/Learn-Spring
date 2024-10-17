package com.springcore.autowire;

//Autowiring using xml configuration
public class Emp {
	private Address address;
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}

	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp(Address address) {
		super();
		this.address = address;
	}


	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	

}
