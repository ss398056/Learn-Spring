package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/saconfig.xml");
		
		Person p = context.getBean("person",Person.class);
		
		System.out.println(p);
		System.out.println(p.getFriendsname().getClass().getName());
		System.out.println(p.getCoursefee().getClass().getName());
		System.out.println(p.getPro().getClass().getName());
	}

}
