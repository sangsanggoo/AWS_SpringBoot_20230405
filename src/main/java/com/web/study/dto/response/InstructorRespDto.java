package com.web.study.dto.response;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;
@Getter
@Builder
public class InstructorRespDto {
	private int id;
	private String name;
	private LocalDate birthDate;
	
	
	
}
