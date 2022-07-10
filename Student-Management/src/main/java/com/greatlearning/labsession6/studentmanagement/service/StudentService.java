package com.greatlearning.labsession6.studentmanagement.service;

import java.util.List;

import com.greatlearning.labsession6.studentmanagement.entity.Student;

public interface StudentService {
	public List<Student> findAll();
    public Student findById(int studentId);
    public void save(Student student);
    public void deleteById(int studentId);
}
