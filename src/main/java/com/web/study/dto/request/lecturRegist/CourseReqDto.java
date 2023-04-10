package com.web.study.dto.request.lecturRegist;

import java.time.LocalDate;

import com.web.study.domain.entity.Course;

import lombok.Setter;
@Setter
public class CourseReqDto {
	private int id;
	private int lecture_id;
	private int student_id;
	private LocalDate regist_date;
	
	public Course toEntity() {
		return Course.builder()
				.lecture_id(lecture_id)
				.student_id(student_id)
				.regist_date(regist_date)
				.build();
	}
}
