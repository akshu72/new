package com.sct.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private int sid;
	
	@Column(name = "Name")
   private String name;
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", course=" + course
				+ "]";
	}


	@Column(name="Email")
   private String email;
	
	@Column(name="Phone")
   private long phone;
   
	
   @Column(name="Course")
   @OneToMany(cascade = CascadeType.ALL,mappedBy="Student")
   private List<Course> course;

	
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
	
	
	public List<Course> getCourse() {
		return course;
	}
	
	
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	   
	   
}
