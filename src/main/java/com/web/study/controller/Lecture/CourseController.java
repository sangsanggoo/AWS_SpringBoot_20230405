package com.web.study.controller.Lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.Service.CourseSerivce;
import com.web.study.dto.DataResponseDto;
import com.web.study.dto.ResponseDto;
import com.web.study.dto.request.lecturRegist.CourseReqDto;

@RestController
public class CourseController {
	@Autowired
	public CourseSerivce courseSerivce;
	
	@PostMapping("/lecturerRegist")
	public ResponseEntity<? extends ResponseDto> register(@RequestBody CourseReqDto lectureRegistReqDto) {
		courseSerivce.registCourse(lectureRegistReqDto);

		return ResponseEntity.ok().body(ResponseDto.ofDefault());
	}
	@GetMapping("/lectures")
	public ResponseEntity<? extends ResponseDto> getCourseAll() {
		return ResponseEntity.ok().body(DataResponseDto.of(null));
	}
	
	// READ0
	public ResponseEntity<? extends ResponseDto> get() {
		return ResponseEntity.ok().body(ResponseDto.ofDefault());
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
	

