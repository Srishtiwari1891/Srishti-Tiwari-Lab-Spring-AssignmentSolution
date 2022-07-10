package com.greatlearning.labsession6.studentmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.labsession6.studentmanagement.entity.Student;
import com.greatlearning.labsession6.studentmanagement.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student findById(int studentId) {
		return studentRepository.findById(studentId).get();
	}

	@Override
	public void save(Student student) {
		studentRepository.save(student);

	}

	@Override
	public void deleteById(int studentId) {
		studentRepository.deleteById(studentId);
	}
}
