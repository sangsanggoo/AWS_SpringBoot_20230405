package com.web.study.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.web.study.domain.entity.Student;
@Mapper
public interface StudentRepository {
	public int registe(Student student);
	public List<Student> getStudentAll();
	public Student getStudentById(int id);
}
