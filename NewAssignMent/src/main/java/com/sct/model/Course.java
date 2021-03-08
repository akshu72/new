package com.sct.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course 
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int cid;
   private String Name;
   private String professorName;
   private String Description;
   @ManyToOne(cascade = CascadeType.ALL)
   private Student student;
   
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getProfessorName() {
		return professorName;
	}
	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	   
   
}
