package com.springboot.controller.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.springboot.entity.Department;


@Mapper
public interface DepartmentMapper {
	@Select("select * from department where id=#{id}")
	public Department getDeptById(Integer id);
	
	@Delete("delete from department where id=#{id}")
	public int deleteDeptById(Integer id);
	
	@Insert("insert into department(departmentName) values(#{departmentName})")
	public int insertDept(Department department);
	
	@Update("update department set departmentName=#{departmentName} where id=#{id}")
	public int updateDept(Department department);
}
