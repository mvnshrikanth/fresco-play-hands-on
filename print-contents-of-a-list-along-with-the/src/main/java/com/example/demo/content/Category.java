package com.example.demo.content;

import java.util.List;

public class Category {

	private int categoryId;
	private String name;
	private String description;
	
	private List<Course> courseList;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	public Category(int categoryId, String name, String description, List<Course> courseList) {
		super();
		this.categoryId = categoryId;
		this.name = name;
		this.description = description;
		this.courseList = courseList;
	}

	public Category() {
	}
	
	
	

	}
