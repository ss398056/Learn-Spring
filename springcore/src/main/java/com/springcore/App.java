package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //This is primitive datatype injection
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        //This is using setter injection
        Students student1 = (Students)context.getBean("student1");
        
        //property schema using setter injection
        Students student2 = (Students)context.getBean("student2");
        
        System.out.println(student1);
        System.out.println(student2);
    }
}
