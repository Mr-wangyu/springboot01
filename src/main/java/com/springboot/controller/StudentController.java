package com.springboot.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Student;
import com.springboot.service.StudentService;

@RestController
public class StudentController {
	/*@Autowired
	private StudentService studentSerice;
	@RequestMapping(value="/",method = RequestMethod.GET)
	public Collection getAll(){
		return studentSerice.getAll();
	}
	*/
	
/*	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Student getById(@PathVariable("id")int id){
		return studentSerice.getById(id);
		
	}*/
}
