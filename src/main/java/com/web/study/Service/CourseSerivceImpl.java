package com.web.study.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.web.study.Repository.CourseRepository;
import com.web.study.domain.entity.Course;
import com.web.study.dto.request.lecturRegist.CourseReqDto;
import com.web.study.dto.response.CourseRespDto;

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
	public List<CourseRespDto> getCourseAll() {
		List<CourseRespDto> dtos = new ArrayList<>();
		courseRepository.getCourseAll().forEach((entity -> {
			dtos.add(entity.toDto());
		}));
		return dtos;
		
	}
	
	@Override
	public List<CourseRespDto> searchCourse(int type,String searchValue) {
		Map<String,Object> parameterMap = new HashMap<>();
		parameterMap.put("type", type);
		parameterMap.put("searchValue", searchValue);
		
		List<CourseRespDto> dtos = new ArrayList<>();
		courseRepository.searchCourse(parameterMap).forEach((entity -> {
			dtos.add(entity.toDto());
		}));
		return dtos;
	}
	
}
