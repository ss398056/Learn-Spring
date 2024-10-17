package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImp;

import org.springframework.jdbc.core.JdbcTemplate;

//Note: This is java bean configuration file if you are not using xml configuration file then you have to use this file

@Configuration
@ComponentScan("com.spring.jdbc.dao")
public class JdbcConfig {
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springtest");
		ds.setUsername("root");
		ds.setPassword("root");
		
		return ds;
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(getDataSource());
		
		return jt;
	}
	
	//Also create object using autowiring by Component annotation
	/*
	@Bean({"stdimp"})
	public StudentDaoImp getStudentDao() {
		StudentDaoImp sd = new StudentDaoImp();
		sd.setCon(getJdbcTemplate());
		
		return sd;
	}
	*/
	
}
