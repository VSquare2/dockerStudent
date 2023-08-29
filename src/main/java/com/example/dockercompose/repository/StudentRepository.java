package com.example.dockercompose.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dockercompose.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
