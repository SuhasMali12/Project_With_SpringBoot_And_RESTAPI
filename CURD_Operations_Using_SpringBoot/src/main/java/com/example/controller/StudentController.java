package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/welcome")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public Student saveStudentData(@RequestBody Student student) {
		return studentService.saveStudentData( student);
	}
	
	@GetMapping("/getall")
	public List<Student> getAllStudentData(){
		return studentService.getAllStudentData();
	}
	
	@GetMapping("/studentid/{id}")
	public Student getStudentById( @PathVariable int id) {
		return studentService.getStudentById(id);
	}
	
	@PostMapping("/update")
	public Student updateStudentData(@RequestBody Student student) {
		return studentService.updateStudentData(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteStudentById(@PathVariable int id) {
		studentService.deleteStudentById(id);
	}

}
