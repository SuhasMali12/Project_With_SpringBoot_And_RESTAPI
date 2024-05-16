package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repositry.StudentRepositry;

@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	private StudentRepositry studentRepositry;
	
	@Override
	public Student saveData(Student student) {
		
		return studentRepositry.save(student);

	}

	@Override
	public List<Student> getAllStudent() {

		return studentRepositry.findAll();		
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepositry.save(student);

	}

	@Override
	public Student getByIdStudent(int id) {
		
	 return	studentRepositry.findById(id).get();

	}

	@Override
	public void deleteStudent(int id) {
		
	 studentRepositry.deleteById(id);

	}

}
