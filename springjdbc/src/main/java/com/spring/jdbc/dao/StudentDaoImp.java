package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("stdimp")
public class StudentDaoImp implements StudentDao {
	//create spring jdbc template object 
	private JdbcTemplate con;
	
	public int insert(Student student) {
		
		//insert query
    	String query = "insert into student(id,name,city) values(?,?,?)";
    	
    	//Execute query
    	int result = this.con.update(query,student.getId(),student.getName(),student.getCity());
    	
    	return result;
	}

	public int change(Student student) {
		String query = "update student set name=?,city=? where id=?";
		int result = this.con.update(query,student.getName(),student.getCity(),student.getId());
		
		return result;
	}

	public int delete(int id) {
		String query = "delete from student where id=?";
		int result = this.con.update(query,id);
		
		return result;
	}

	public Student getStudent(int id) {
		
		String query = "select * from student where id=?";
		//we can also use anonyamus class for RowMapper without external rowmapper class
		RowMapper<Student> rowMapper = new RowMapperImp();
		
		Student student = this.con.queryForObject(query, rowMapper, id);
		return student;
	}
	
	public List<Student> getAllStudents() {
		String query = "select * from student";
		List<Student> students = this.con.query(query, new RowMapperImp());
		return students;
	}
	
	
	public JdbcTemplate getCon() {
		return con;
	}
	
	@Autowired			//This is set automatic con value by @Autowired by stereotype
	public void setCon(JdbcTemplate con) {
		this.con = con;
	}

	
	
}
