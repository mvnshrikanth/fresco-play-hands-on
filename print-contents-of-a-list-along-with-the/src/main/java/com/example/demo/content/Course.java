package com.example.demo.content;

public class Course {

    private int courseId;
    public int categoryId;
	private String name;
	private int duration;
	private int miles;
	
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getMiles() {
		return miles;
	}
	public void setMiles(int miles) {
		this.miles = miles;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course(int courseId, String name, int duration, int miles, int categoryId) {
		super();
		this.courseId = courseId;
		this.categoryId = categoryId;
		this.name = name;
		this.duration = duration;
		this.miles = miles;
		
	}

	public Course() {
		}

	
}
