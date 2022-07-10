package com.greatlearning.labsession6.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.labsession6.studentmanagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}
