package com.example.dockercompose.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dockercompose.entity.Student;
import com.example.dockercompose.service.StudentService;




@RestController
public class StudentController {

	StudentService studentService;
	
	@Autowired
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping("/getStudents")
	public ResponseEntity<List<Student>> getAllStudents(){
		
		List<Student> students = studentService.getStudents();
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
				
	}
	
	@PostMapping("/addStudent")
	public ResponseEntity<Student> createStudent( @RequestBody Student student){
		Student createdStudent =   studentService.createStudent(student);
		return new ResponseEntity<>(createdStudent,HttpStatus.CREATED);
	}
}
