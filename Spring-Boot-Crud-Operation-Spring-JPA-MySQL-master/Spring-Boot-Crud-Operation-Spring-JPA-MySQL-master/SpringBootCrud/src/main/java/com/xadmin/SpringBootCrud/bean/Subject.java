package com.xadmin.SpringBootCrud.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Subject")
public class Subject {
	
	@Id
	private String id;
	private String name;
	private String course;
	private String department;
	private String gender;
	
	public Subject() {
		super();
	}


	public String getId() {
		return id;
	}

	

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Subject(String name, String course, String department, String gender) {
		super();
		this.name = name;
		this.course = course;
		this.department = department;
		this.gender = gender;
	}
	
	
	

}
