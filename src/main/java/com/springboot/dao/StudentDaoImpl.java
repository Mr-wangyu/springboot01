package com.springboot.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.springboot.entity.Student;

@Repository("studentDAO")
public class StudentDaoImpl implements StudentDAO{
	
	private Map studentMap = new HashMap(){
		{
			put(1,new Student(1,"张三",22));
			put(2,new Student(2,"李四",23));
		}
	};

	@Override
	public Collection getAll() {
		// TODO Auto-generated method stub
		return studentMap.values();
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return (Student) studentMap.get(id);
	}

	@Override
	public Collection deleteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
