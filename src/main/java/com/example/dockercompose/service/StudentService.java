package com.example.dockercompose.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dockercompose.entity.Student;
import com.example.dockercompose.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	public Student createStudent( Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	
	
	
}
