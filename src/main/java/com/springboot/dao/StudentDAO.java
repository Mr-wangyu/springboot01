package com.springboot.dao;

import java.util.Collection;

import com.springboot.entity.Student;

public interface StudentDAO {
		/**
		 * 获取所有学生对象
		 */
	public Collection getAll();
	
	/**
	 * 传入要获取的学生id
	 */
	public Student getById(int id);
	
	/**
	 * 传入要删除的学生id
	 */
	public Collection deleteById(int id);
	
}
