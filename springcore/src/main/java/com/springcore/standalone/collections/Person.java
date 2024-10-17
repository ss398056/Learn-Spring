package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friendsname;
	private Map<String, Integer> coursefee;
	private Properties pro;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public List<String> getFriendsname() {
		return friendsname;
	}

	public void setFriendsname(List<String> friendsname) {
		this.friendsname = friendsname;
	}
	
	

	public Map<String, Integer> getCoursefee() {
		return coursefee;
	}

	public void setCoursefee(Map<String, Integer> coursefee) {
		this.coursefee = coursefee;
	}
	

	public Properties getPro() {
		return pro;
	}

	public void setPro(Properties pro) {
		this.pro = pro;
	}

	@Override
	public String toString() {
		return "Person [friendsname=" + friendsname + ", coursefee=" + coursefee + ", pro=" + pro + "]";
	}

	

	
	
	
}
