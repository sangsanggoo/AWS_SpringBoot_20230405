package com.web.study.dto.request.lecturer;

import java.time.LocalDate;

import com.web.study.domain.entity.Lecturer;

import lombok.Setter;
import lombok.ToString;
@Setter
@ToString
public class LecturerReqDto {
	private int id;
	private String name;
	private LocalDate birth_date;
	
	public Lecturer toEntity() {
		return Lecturer.builder()
				.name(name)
				.birth_date(birth_date)
				.build();
	}
}
