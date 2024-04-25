package com.sample.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.demo.entity.Student;
import com.sample.demo.service.StudentServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1")
public class StudentController {
	
	@Autowired
	private StudentServiceImpl service;
	
	@PostMapping("/student")
	public ResponseEntity<?>createStudent(@RequestBody Student st){
		try {
			service.createStudent(st);
			return ResponseEntity.ok("Data Saved");
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@GetMapping("/student")
	public ResponseEntity<?>getAll(){
		try {
			return ResponseEntity.ok(service.getAllStudent());
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@PutMapping("/student")
	public ResponseEntity<?>updateStudent(@RequestBody Student st){
		try {
			service.updateStudent(st);
			return ResponseEntity.ok("Data updated");
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@DeleteMapping("/student/{Id}")
	public ResponseEntity<?>deleteStudnet(@PathVariable Integer Id){
		try {
			service.deleteStudent(Id);
			return ResponseEntity.ok("Data deleted");
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	

}
