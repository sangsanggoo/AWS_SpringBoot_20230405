package com.web.study.dto.response;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LectureRespDto {
	private int lecturId;
	private String lectureName;
	private int lecturePrice;
	private String instructorName;
	
	
}
