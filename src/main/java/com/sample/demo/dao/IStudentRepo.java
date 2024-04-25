package com.sample.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.demo.entity.Student;

@Repository
public interface IStudentRepo extends JpaRepository<Student, Integer>{

}
