package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="course_details")
public class Course {

	@Id
	private int courseid;
	private String courseName;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int courseid, String courseName) {
		super();
		this.courseid = courseid;
		this.courseName = courseName;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
