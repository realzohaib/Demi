package com.sample.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	private String name;
	private String mobile;

}
