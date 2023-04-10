package com.web.study.Service;

import org.springframework.stereotype.Service;

import com.web.study.Repository.CourseRepository;
import com.web.study.domain.entity.Course;
import com.web.study.dto.request.lecturRegist.CourseReqDto;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class CourseSerivceImpl implements CourseSerivce{

	public final CourseRepository courseRepository;
	@Override
	public void registCourse(CourseReqDto courseReqDto) {
		Course course = courseReqDto.toEntity();
		courseRepository.registe(course);
	}
	@Override
	public void getCourseAll() {
		courseRepository.getCourseAll();
		
	}
	
}
