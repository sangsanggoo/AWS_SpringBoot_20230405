package com.web.study.controller.Lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.Service.LectureService;
import com.web.study.dto.ResponseDto;
import com.web.study.dto.request.StudentReqDto;

@RestController
public class StudentController {
	@Autowired
	public LectureService lectureService;
	@PostMapping("/student")
	public ResponseEntity<? extends ResponseDto> register(@RequestBody StudentReqDto studentReqDto) {
	lectureService.registStudent(studentReqDto);

		return ResponseEntity.ok().body(ResponseDto.ofDefault());
	}
	// READ
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
