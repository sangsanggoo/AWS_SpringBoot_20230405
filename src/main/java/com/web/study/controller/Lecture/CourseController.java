package com.web.study.controller.Lecture;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.AOP.annotation.ParamsAspect;
import com.web.study.AOP.annotation.TimerAspect;
import com.web.study.AOP.annotation.ValidAspect;
import com.web.study.Service.CourseSerivce;
import com.web.study.dto.DataResponseDto;
import com.web.study.dto.ResponseDto;
import com.web.study.dto.request.course.CourseReqDto;
import com.web.study.dto.request.course.SearchCourseReqDto;
import com.web.study.exception.CustomException;

@RestController
public class CourseController {
	@Autowired
	public CourseSerivce courseSerivce;
	
	
	@PostMapping("/course")
	public ResponseEntity<? extends ResponseDto> register(@RequestBody CourseReqDto lectureRegistReqDto) {
		courseSerivce.registCourse(lectureRegistReqDto);

		return ResponseEntity.ok().body(ResponseDto.ofDefault());
	}
	@TimerAspect
	@GetMapping("/courses")
	public ResponseEntity<? extends ResponseDto> getCourseAll() {

		return ResponseEntity.ok().body(DataResponseDto.of(courseSerivce.getCourseAll()));
	}
	@ValidAspect
	@ParamsAspect
	@GetMapping("/search/courses")
	public ResponseEntity<? extends ResponseDto> searchCourse(@Valid SearchCourseReqDto courseReqDto ,BindingResult bindingResult) {
		
//		if(bindingResult.hasErrors()) {
//			Map<String, String> errorMap = new HashMap<>();
//			bindingResult.getFieldErrors().forEach(error -> {
//				System.out.println(error.getField() + " : " + error.getDefaultMessage());
//				errorMap.put(error.getField(),error.getDefaultMessage());
//			});
//
//			throw new CustomException("유효성검사 실패",errorMap);
//		}
//		
		return ResponseEntity.ok().body(DataResponseDto.of(courseSerivce.searchCourse(courseReqDto.getType(),courseReqDto.getSearchValue())));
		
	}
	// Update
	public ResponseEntity<? extends ResponseDto> modify() {
		return ResponseEntity.ok().body(ResponseDto.ofDefault());
	}
	// Delete
	public ResponseEntity<? extends ResponseDto> remove() {
		return ResponseEntity.ok().body(ResponseDto.ofDefault());
	}
}
	

