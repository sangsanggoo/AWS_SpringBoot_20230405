package com.web.study.domain.entity;

import java.time.LocalDate;

import com.web.study.dto.response.LecturerRespDto;
import com.web.study.dto.response.StudentRespDto;

import lombok.Builder;
import lombok.Setter;
@Builder
@Setter
public class Student {
	private int id;
	private String name;
	private LocalDate birth_date;
	
	public StudentRespDto toDto() {
		return StudentRespDto.builder()
				.id(id)
				.name(name)
				.birthDate(birth_date)
				.build();
	}
}
