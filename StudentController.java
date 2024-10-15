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
	    
	    @GetMapping("/{id}")
	    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
	        Optional<Student> student = studentRepository.findById(id);
	        return student.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }
	        
	        @PutMapping("/{id}")
	        public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) {
	            Optional<Student> optionalStudent = studentRepository.findById(id);
	            if (!optionalStudent.isPresent()) {
	                return ResponseEntity.notFound().build();
	            }
	            Student student = optionalStudent.get();
	            student.setName(studentDetails.getName());
	            student.setAge(studentDetails.getAge());
	            studentRepository.save(student);
	            return ResponseEntity.ok(student);
	        }
}
