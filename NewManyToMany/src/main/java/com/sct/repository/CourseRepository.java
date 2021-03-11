package com.sct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sct.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>
{

	

	Course findByCid(int cid);
}
