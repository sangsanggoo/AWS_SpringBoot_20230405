package com.web.study.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.web.study.domain.entity.Instructor;
@Mapper
public interface InstructorRepository {
	public int registe(Instructor instructor);
	public List<Instructor> getInstructorAll();
	public Instructor findInstructorById(int id);
}
