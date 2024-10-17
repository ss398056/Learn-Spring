package com.springcore.without.xml.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages ="com.springcore.without.xml.config")				//use when using Component annotation in targeted class 
public class JavaConfig {
	@Bean
	public Teacher getTeacher() {
		Teacher t = new Teacher();
		return t;
	}
	
	@Bean(name= {"student","s1","s2"})
	public Student getStudent() {
		Student s = new Student(getTeacher());
		return s;
	}
}
