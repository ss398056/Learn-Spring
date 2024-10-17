package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		Mobile m = (Mobile)context.getBean("mob");
		
		System.out.println(m);
		context.registerShutdownHook();
		
		System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		
		Earburds e = (Earburds)context.getBean("ear");
		System.out.println(e);
		
		System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		
		Laptop l = (Laptop)context.getBean("lap");
		System.out.println(l);
	}

}
