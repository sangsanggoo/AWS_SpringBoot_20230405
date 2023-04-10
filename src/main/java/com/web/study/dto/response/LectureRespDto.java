package com.web.study.dto.response;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LectureRespDto {
	private String lectureName;
	private int lecturePrice;
	private int lectureId;
	
	
}
