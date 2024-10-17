package com.springcore.springexpressionlanguage;

import org.springframework.expression.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springexpressionlanguage/selconfig.xml");
		
		Demo d1 = context.getBean("demo",Demo.class);
		
		System.out.println(d1);
		
		//Using spring expression using SpelExpression API
		SpelExpressionParser spel = new SpelExpressionParser();			
		Expression exp = spel.parseExpression("65+42+66");
		
		System.out.println(exp.getValue());
	}

}
