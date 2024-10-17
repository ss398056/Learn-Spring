package com.springcore.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Note: default bean scope is singleton
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/annotations/stereotypeannotationconfig.xml");
		
		Student s1 = context.getBean("obj",Student.class);
		
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		//Bean scope prototype using annotations
		Student s2 = context.getBean("obj",Student.class);
		System.out.println(s2.hashCode());
		
		//Bean scope prototype using xml
		Teacher t1 = context.getBean("tech",Teacher.class);
		System.out.println(t1.hashCode());
		Teacher t2 = context.getBean("tech",Teacher.class);
		System.out.println(t2.hashCode());
	}

}
