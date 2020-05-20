package com.springboot.service;

import java.util.Collection;

import com.springboot.entity.Student;

public interface StudentService {

	public Collection getAll();
	
	public Student getById(int id);
}
