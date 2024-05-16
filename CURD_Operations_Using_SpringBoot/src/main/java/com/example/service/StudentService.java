package com.example.service;

import java.util.List;
import com.example.model.Student;

public interface StudentService {
	
	public Student saveStudentData(Student student);
	
	public List<Student> getAllStudentData();
	
	public Student getStudentById(int id);
	
	public Student updateStudentData(Student student);
	
	public void deleteStudentById(int id);

}
