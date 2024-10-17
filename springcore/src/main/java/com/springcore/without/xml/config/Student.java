package com.springcore.without.xml.config;

import org.springframework.stereotype.Component;

//@Component
public class Student {
	private Teacher teacher;
	
	public Student(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void study() {
		teacher.teach();
		System.out.println("student is studying...");
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Student [teacher=" + teacher + "]";
	}
	
	
}
