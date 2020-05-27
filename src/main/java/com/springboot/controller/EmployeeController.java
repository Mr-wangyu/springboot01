package com.springboot.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.entity.Employee;

@Controller
public class EmployeeController {
	/*@Autowired
	EmployeeDao employeeDao;
	//查询所有员工返回列表页面
	@GetMapping("/emps")
	public String list(Model model){
		
		Collection<Employee> employees =  employeeDao.getAll();
		
		model.addAttribute("emps",employees);
		
		//thymeleaf默认拼串
		//classpath:/temelates/xxx.html
		return "list";
	}
	@GetMapping("/emp")
	public String toAddPage(){
		
		return "add";
		
		
	}
	@PostMapping("/emp")
	public String addEmp(Employee employee){
		
		System.out.println(employee);
		employeeDao.save(employee);
		return "redirect:/emps";
		
	}*/
	
}
