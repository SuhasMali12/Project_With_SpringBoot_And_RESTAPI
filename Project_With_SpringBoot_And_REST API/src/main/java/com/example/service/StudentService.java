package com.example.service;

import java.util.List;

import com.example.entity.Student;

public interface StudentService {
	
	public Student saveData(Student student);
	public List<Student> getAllStudent();
	public Student updateStudent(Student student);
	public Student getByIdStudent(int id);
	public void deleteStudent(int id);
	

}
