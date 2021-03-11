package com.sct.model;

import java.util.ArrayList;
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
  @GeneratedValue(strategy =GenerationType.IDENTITY)
  private int cid;
  private String cname;
  private String cDetails;
  @ManyToMany(cascade = CascadeType.ALL,mappedBy = "courses")
  private List<Student> students =new ArrayList<>();
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getcDetails() {
		return cDetails;
	}
	public void setcDetails(String cDetails) {
		this.cDetails = cDetails;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
  
  
}
