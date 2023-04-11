package com.web.study.dto.request.lecturer;

import java.time.LocalDate;

import com.web.study.domain.entity.Instructor;

import lombok.Setter;
import lombok.ToString;
@Setter
@ToString
public class InstructorReqDto {
	private int id;
	private String lecture_id;
	private LocalDate lecture_birth;
	
	public Instructor toEntity() {
		return Instructor.builder()
				.itm_name(lecture_id)
				.itm_birth(lecture_birth)
				.build();
	}
}
