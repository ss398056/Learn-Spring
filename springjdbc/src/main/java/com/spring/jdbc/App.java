package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImp;
import com.spring.jdbc.entities.Student;

//Note: In this project we have use two method for config spring jdbc 
public class App 
{
    public static void main( String[] args )
    {
        //Creating ApplicationContext object using xml configuration file
    	//ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    	
    	//Creating ApplicationContext object using java annotation configuration file
    	ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
    	
    	/*create spring jdbc object
    	JdbcTemplate temp = context.getBean("jdbctemp",JdbcTemplate.class);
    	
    	//insert query
    	String query = "insert into student(id,name,city) values(?,?,?)";
    	
    	//Execute query
    	int result = temp.update(query,23,"Raman","Delhi");*/
    	
    	StudentDao dao = context.getBean("stdimp",StudentDao.class);
    	
    	//insert record/data into database
    	/*Student s1 = new Student();
    	s1.setId(6466);
    	s1.setName("Sakshi");
    	s1.setCity("Noida");
    	
    	int res = dao.insert(s1);
    	System.out.println("recored inserted "+res);*/
    	
    	//update record/data into database
    	/*Student s2 = new Student();
    	s2.setId(23);
    	s2.setName("Raman");
    	s2.setCity("Noida");
    	int res = dao.change(s2);
    	System.out.println("record updated "+res);*/
    	
    	//delete record/data from database 
    	/*int res = dao.delete(6466);
    	System.out.println("record deleted "+res);*/
    	
    	//fetch single record/data from database 
    	Student s3 = dao.getStudent(23);
    	System.out.println("Single record "+s3);
    	
    	//fetch all record/data from database
    	List<Student> students = dao.getAllStudents();
    	for(Student s : students) {
    		System.out.println(s);
    	}
    	
    }
}
