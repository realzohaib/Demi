package com.sample.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.demo.dao.IStudentRepo;
import com.sample.demo.entity.Student;

@Service
public class StudentServiceImpl implements IStudentService{
	
	@Autowired
	private IStudentRepo repo;

	@Override
	public Student createStudent(Student st) {
		return repo.save(st);
	}

	@Override
	public List<Student> getAllStudent() {
		return repo.findAll();
	}

	@Override
	public Student updateStudent(Student st) {
		return repo.save(st);
	}

	@Override
	public void deleteStudent(Integer studentId) {
		repo.deleteById(studentId);
	}

}
