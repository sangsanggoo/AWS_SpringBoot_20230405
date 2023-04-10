package com.web.study.Repository;

import org.apache.ibatis.annotations.Mapper;

import com.web.study.domain.entity.Course;
@Mapper
public interface CourseRepository {
	public int registe(Course course);
	public Course getCourseAll();
}		
