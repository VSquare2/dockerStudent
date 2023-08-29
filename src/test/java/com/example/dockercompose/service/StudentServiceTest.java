package com.example.dockercompose.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.dockercompose.entity.Student;
import com.example.dockercompose.repository.StudentRepository;


@ExtendWith(MockitoExtension.class)
class StudentServiceTest {
	
	
	@Mock
	private StudentRepository studentRepository;
	
	@InjectMocks
	private StudentService studentService;
	
	
	@Test
	void testGetStudents() {
		
		
		Student s1= new Student();
		s1.setAge(10);
		s1.setSid(1);
		s1.setSname("RAM");
		
		Student s2= new Student();
		s2.setAge(11);
		s2.setSid(2);
		s2.setSname("SHAM");
		
		List<Student> slist= new ArrayList();
		
		slist.add(s1);
		slist.add(s2);
		
		Mockito.when(studentRepository.findAll()).thenReturn(slist);
		
		
		List<Student> slist2  = studentService.getStudents();
		
		assertEquals(10, slist2.get(0).getAge());
		
	}

}
