package com.springcore.constructorinjection;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certi c;
	private List<Integer> list;
	public Person(String name, int personId, Certi c, List<Integer> list) {
		this.name = name;
		this.personId = personId;
		this.c = c;
		this.list = list;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.personId+" : Certi{"+this.c.name+" "+this.c.duration+"}"+" : "+this.list;
	}
	
	

}
