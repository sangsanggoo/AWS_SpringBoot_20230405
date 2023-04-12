package com.web.study.dto.request.lecturer;

import java.time.LocalDate;

import com.web.study.domain.entity.Instructor;

import lombok.Setter;
import lombok.ToString;
@Setter
@ToString
public class InstructorReqDto {
	private int id;
	private String itm_name;
	private LocalDate itm_birth;
	
	public Instructor toEntity() {
		return Instructor.builder()
				.itm_name(itm_name)
				.itm_birth(itm_birth)
				.build();
	}
}
