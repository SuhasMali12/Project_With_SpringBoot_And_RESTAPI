package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/student-Api")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@PostMapping("/save")
	public Student saveData(@RequestBody Student student) {
		return studentService.saveData(student);
		
	}
	@GetMapping("/getall")
	public List<Student> getAllStudent(){
		return studentService.getAllStudent();
	}
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
		
	}
	@GetMapping("/getById/{id}")
	public Student getByIdStudent(@PathVariable int id) {
		return studentService.getByIdStudent(id);
		
	}
	@DeleteMapping("/deleteById/{id}")
	public void deleteStudent(@PathVariable int id) {
		 studentService.deleteStudent(id);
		
	}
	
}
