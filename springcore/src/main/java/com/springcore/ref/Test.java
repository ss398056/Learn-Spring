package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A a1 = (A)context.getBean("a1");
		
		System.out.println(a1.getX());
		System.out.println(a1.getObj().getY());
		System.out.println(a1);
	}

}
