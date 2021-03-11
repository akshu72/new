package com.sct.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sct.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	

	List<Student> findByCourses_id(int cid);

	

}
