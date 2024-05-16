package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Student;

public interface StudentRepositry extends JpaRepository<Student, Integer>{

}
