package com.web.study.Service;

import java.util.List;

import com.web.study.domain.entity.Course;
import com.web.study.dto.request.lecturRegist.CourseReqDto;
import com.web.study.dto.response.CourseRespDto;

public interface CourseSerivce {
	public void registCourse(CourseReqDto courseReqDto);
	public List<CourseRespDto> getCourseAll();
	public List<CourseRespDto> searchCourse(int type,String searchValue); 
}
