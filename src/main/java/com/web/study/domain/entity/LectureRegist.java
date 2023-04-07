package com.web.study.domain.entity;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Setter;
@Builder
@Setter
public class LectureRegist {
	private int id;
	private int lecture_id;
	private int student_id;
	private LocalDate regist_date;
}
