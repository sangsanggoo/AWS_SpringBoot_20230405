package com.web.study.Repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.web.study.domain.entity.Course;
@Mapper
public interface CourseRepository {
	public int registe(Course course);
	public List<Course> getCourseAll();
	public List<Course> searchCourse(Map<String, Object> parameterMap); 
}		
