package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")


public class StudentController {
	
	 @Autowired
	    private StudentService studentService;

	    
	    @PostMapping
	    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
	        Student savedStudent = studentService.saveStudent(student);
	        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
	    }
}
