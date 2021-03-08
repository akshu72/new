package com.sct.service;

import java.util.List;

import com.sct.model.Course;
import com.sct.model.Student;

public interface HomeService 
{
	public Course addCourse(Course course);
	public void addStudent(Student s);
	public List<Student> getStudent();
	public void deleteCourse(int cid);
	public List<Student> getDataByCourse(int cid);
	public List<Student> getoneOrMoreCourse();
}
