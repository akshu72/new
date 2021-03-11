package com.sct.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Table(name = "courses")
@Entity
public class Course 
{
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int cid;
   private String Name;
   private String professorName;
   public Set<Student> getStudent() {
	return student;
}
	public void setStudent(Set<Student> student) {
		this.student = student;
	}
	private String Description;
   @ManyToMany(mappedBy = "courses")
   private Set<Student> student= new HashSet<>(); 
  
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
