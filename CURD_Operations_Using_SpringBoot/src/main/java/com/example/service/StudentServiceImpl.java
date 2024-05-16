package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentRepositry;
import com.example.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepositry studentRepositry;

	@Override
	public Student saveStudentData(Student student) {
	return studentRepositry.save(student);
	}

	@Override
	public List<Student> getAllStudentData() {
		
		return studentRepositry.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		
		return studentRepositry.findById(id).get();
	}

	@Override
	public Student updateStudentData(Student student) {
		
		return studentRepositry.save(student);
	}

	@Override
	public void deleteStudentById(int id) {
		studentRepositry.deleteById(id);
		
	}

	

}
