package com.web.study.dto.request.lecture;

import com.web.study.domain.entity.Instructor;
import com.web.study.domain.entity.Lecture;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class LectureReqDto {
	private String lectureName;
	private int lecturePrice;
	private int lectureId;
	private Instructor instructor;
	// 생성될 때 값들이 정해지는 것을 사용해서
	// Lecture 객체를 만들어서 다시 보내줌
	public Lecture toEntity() {
		return Lecture.builder()
				.ltm_name(lectureName)
				.ltm_price(lecturePrice)
				.ltm_id(lectureId)
				.build();
	}
}
