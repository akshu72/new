package com.sct.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sct.model.Course;
import com.sct.model.Student;
import com.sct.repository.CourseRepository;
import com.sct.repository.StudentRepository;

@Service
public class HomeServices
{
	@Autowired
	CourseRepository cr;

	@Autowired
	StudentRepository sr;
	
	public void addCourse(Course course) 
	{
     Course c= cr.save(course);
	}
	
	
	public void addStudent(Student s) 
	{
		Student st= sr.save(s);
	}
	
	public List<Student> getStudent()
	{
		List<Student> list=sr.findAll();
		return list;
	}
	
	public String deleteCourse(int cid) 
	{
	  cr.deleteById(cid);
	  return "delete  Successfully ";
	}
	
	
	
	public List<Student> getAllStudentUnderPerticularCourse(int cid)
	{
		Course c=cr.findByCid(cid);
		 List<Student>  slist=sr.findByCourses_id(c.getCid());
		return slist;
	}

	
	
}
