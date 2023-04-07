package com.web.study.dto.request;

import java.time.LocalDate;

import com.web.study.domain.entity.LectureRegist;

import lombok.Setter;
@Setter
public class LectureRegistReqDto {
	private int id;
	private int lecture_id;
	private int student_id;
	private LocalDate regist_date;
	
	public LectureRegist toEntity() {
		return LectureRegist.builder()
				.lecture_id(lecture_id)
				.student_id(student_id)
				.regist_date(regist_date)
				.build();
	}
}
