package com.sct.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sct.model.Course;
import com.sct.model.Student;
import com.sct.repository.CourseRepository;
import com.sct.repository.HomeRepository;
import com.sct.service.HomeService;

@Service
public class HomeServiceImp implements HomeService 
{
	@Autowired
	HomeRepository hr;
	
	@Autowired
	CourseRepository cr;

	public Course addCourse(Course course) 
	{
	      Course c= cr.save(course);
		return c;
	}

	public void addStudent(Student s) 
	{
		Student st= hr.save(s);
		
	}


	@Override
	public List<Student> getStudent() {

		   List<Student> ls=hr.findAll();
			return ls;
	}

	public void deleteCourse(int cid) 
	{
		cr.deleteById(cid);
		
	}

	@Override
	public List<Student> getDataByCourse(int cid)
	{
		List<Student> lStudents=hr.findByCourseId(cid);
		return null;
	}

	@Override
	public List<Student> getoneOrMoreCourse() 
	{
		Course course=new Course();
		int newid= course.getCid();
		if (newid>1) 
		{
			List<Student>list=hr.findAll();
		}
		else {
			System.out.println("Student have only one course ");
		}
		return null;
	}

	
	
	 
	 
}
