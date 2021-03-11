package com.sct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sct.model.Course;
import com.sct.model.Student;
import com.sct.services.HomeServices;

@RestController
public class HomeController 
{
	@Autowired
	HomeServices hs;
	@PostMapping("/Course")
    public String  addCourse(@RequestBody Course course)
    {
    	hs.addCourse(course);
		return "Add Course Successfully";
    }
	
	  @PostMapping("/student") 
	  public String addStudent(@RequestBody Student s)
	  {
	  hs.addStudent(s);
	  return "Add Student Successfully";
	  }
	  
	  
	  @GetMapping("/get")
	  public List<Student> getStudentsList() 
	  {
       List<Student>ls=hs.getStudent();
       return ls;
	  }
	  
	  
	  @DeleteMapping("/delete/{cid}")
	  public String deleteCourse(@PathVariable int cid)
	  {
		 hs.deleteCourse(cid); 
			  
		return "delete Course successfully";
		}
	  
	  
	  @GetMapping("/getallStudent/{cid}")
		public List<Student>getAllStudentUnderPerticularCourse(@PathVariable("cid") int cid){
			return hs.getAllStudentUnderPerticularCourse(cid);
		}

}
	  
/*
 * @GetMapping("getDataByCourse") public List<Student> getDataByCourseId(int
 * cid) { List<Student>ls=hs.getDataByCourses(cid); return ls; } }
 */
