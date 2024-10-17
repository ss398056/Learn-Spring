package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	StudentDao dao = context.getBean("studentDao",StudentDao.class);
    	/*
    	Student s1 = new Student(2955,"Sandeep","Noida");
    	//SessionFactory f = context.getBean("factory",SessionFactory.class);
    	
    	//int res = dao.insert(s1);
    	//System.out.println( s1 );
    	
    	Student s2 = dao.getStudent(2955);
    	System.out.println( s2 );
    	
    	List<Student> allstudents = dao.getAllStudents();
    	System.out.println( allstudents );
    	
    	//dao.deleteStudent(2455);
    	dao.updateStudent(new Student(2955,"Karan","Lucknow"));
    	*/
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	while(true) {
    		System.out.println("\n\n**************Welcome To Student Management System**************");
        	System.out.println("Press 1 : Add New Record");
        	System.out.println("Press 2 : Display All Students");
        	System.out.println("Press 3 : Get Display Single Record By Id");
        	System.out.println("Press 4 : Delete Single Record By Id");
        	System.out.println("Press 5 : Update Student Record");
        	System.out.println("Press 6 : Exit");
        	
        	
        	try {
        		int op = Integer.parseInt(br.readLine());
        		int id;
        		String name,city;
        		if(op==1) {
        			System.out.print("Enter Student Id : ");
        			id = Integer.parseInt(br.readLine());
        			System.out.print("Enter Student Name : ");
        			name = br.readLine();
        			System.out.print("Enter Student City : ");
        			city = br.readLine();
        			int res = dao.insert(new Student(id,name,city));
        			System.out.print("insert successfully "+res);
        			
        		}else if(op==2) {
        			List<Student> students = dao.getAllStudents();
        			for(Student s : students){
        				System.out.println(s);
        			}
        			
        		}else if(op==3) {
        			System.out.print("Enter Student Id : ");
        			id = Integer.parseInt(br.readLine());
        			dao.getStudent(id);
        			
        		}else if(op==4) {
        			System.out.print("Enter Student Id : ");
        			id = Integer.parseInt(br.readLine());
        			dao.deleteStudent(id);
        		}else if(op==5) {
        			System.out.print("Enter Student Id : ");
        			id = Integer.parseInt(br.readLine());
        			System.out.print("Enter Student Name : ");
        			name = br.readLine();
        			System.out.print("Enter Student City : ");
        			city = br.readLine();
        			dao.updateStudent(new Student(id,name,city));
        			System.out.print("update successfully ");
        		}else if(op==6) {
        			break;
        		}
        		
        	} catch(Exception e) {
        		System.out.println("Invalid input try with another input\n");
        	}
    	}
    	
    	
    	
    }
}
