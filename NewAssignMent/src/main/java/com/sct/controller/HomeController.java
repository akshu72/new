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
import com.sct.serviceimp.HomeServiceImp;

@RestController
public class HomeController
{
    @Autowired
   
    HomeServiceImp hsi;
    
    @PostMapping("/Course")
    public String  addCourse(@RequestBody Course course)
    {
    	hsi.addCourse(course);
		return "Add Course Successfully";
    }
    
	/*
	 * @PostMapping("/student") public String addCourse(@RequestBody Student s) {
	 * hsi.addStudent(s); return "Add Student Successfully"; }
	 * 
	 * @GetMapping("/get") public List<Student> getStudentsList() {
	 * List<Student>ls=hsi.getStudent(); return ls; }
	 * 
	 * 
	 * @GetMapping("getDataByCourse") public List<Student> getDataByCourseId(int
	 * cid) { List<Student>ls=hsi.getDataByCourse(cid); return ls; }
	 * 
	 * @DeleteMapping("/delete") public String deleteCoure(@PathVariable int cid) {
	 * hsi.deleteCourse(cid); return "delete Course successfully"; }
	 * 
	 * @GetMapping("/getlistcourse") public List<Student> getoneOrMoreCourse() {
	 * List<Student> ls2=hsi.getoneOrMoreCourse(); return ls2; }
	 */
}
