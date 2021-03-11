package com.sct.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private int sid;
	
	
   private String name;

	
   private String email;
	
   private long phone;
   @ManyToMany(cascade = CascadeType.ALL)
   private Set<Course> courses= new HashSet<>();
   
	public Set<Course> getCoursesSet() {
	return courses;
}


public void setCoursesSet(Set<Course> coursesSet) {
	this.courses = coursesSet;
}


	public int getSid() {
		return sid;
	}
	
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public long getPhone() {
		return phone;
	}
	
	
	public void setPhone(long phone) {
		this.phone = phone;
	}
	

	

}
