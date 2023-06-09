package com.web.study.dto.request.course;

import java.time.LocalDate;

import com.web.study.domain.entity.Course;

import lombok.Setter;
@Setter
public class CourseReqDto {
	private int id;
	private int lecture_id;
	private int student_id;
	private LocalDate registe_date;
	
	public Course toEntity() {
		return Course.builder()
				.ltm_id(lecture_id)
				.sdm_id(student_id)
				.registe_date(registe_date)
				.build();
	}
}
