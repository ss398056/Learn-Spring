package com.springcore.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//using stereotype annotations

@Component("obj")		//use for creating object without bean
@Scope("prototype")		//use for change bean scope
public class Student {
	@Value("Sandeep Singh")		//set value for attributes
	private String name;
	@Value("Noida")
	private String city;
	@Value("#{add}")			//set collection using annotation
	private List<String> address;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	
	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", address=" + address + "]";
	}

	
	
	

}
