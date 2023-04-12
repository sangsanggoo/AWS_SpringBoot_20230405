package com.web.study.dto.request.course;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SearchCourseReqDto {
	@Min(value = 1)
	@Max(value = 3)
	private int type;
	
	@NotBlank(message = "빈값은 안돼요")
	private String SearchValue;
}
