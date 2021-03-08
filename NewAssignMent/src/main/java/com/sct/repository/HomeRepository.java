package com.sct.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sct.model.Student;
@Repository
public interface HomeRepository extends JpaRepository<Student, Integer>
{

	List<Student> findByCourseId(int cid);

}
