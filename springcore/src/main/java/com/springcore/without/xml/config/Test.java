package com.springcore.without.xml.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// using AnnotationConfigApplicationContext class for getting configuration java file
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student s1 = context.getBean("student",Student.class);
		
		s1.study();
		
	}

}
