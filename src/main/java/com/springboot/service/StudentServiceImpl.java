package com.springboot.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.StudentDAO;
import com.springboot.entity.Student;

@Service("studentService")
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDAO studentDAO;
		
	@Override
	public Collection getAll() {
		// TODO Auto-generated method stub
		return studentDAO.getAll();
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return studentDAO.getById(id);
	}
	
}
