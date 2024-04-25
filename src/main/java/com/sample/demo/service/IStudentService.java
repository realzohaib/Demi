package com.sample.demo.service;

import java.util.List;

import com.sample.demo.entity.Student;

public interface IStudentService {
	public Student createStudent(Student st);
	
	public List<Student>getAllStudent();
	
	public Student updateStudent(Student st);
	
	public void deleteStudent(Integer studentId);

}
