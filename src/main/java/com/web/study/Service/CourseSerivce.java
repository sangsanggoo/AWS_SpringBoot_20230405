package com.web.study.Service;

import com.web.study.dto.request.lecturRegist.CourseReqDto;

public interface CourseSerivce {
	public void registCourse(CourseReqDto courseReqDto);
	public void getCourseAll();
}
