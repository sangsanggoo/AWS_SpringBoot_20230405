package com.web.study.controller.Lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.AOP.annotation.CheckNameAspect;
import com.web.study.Service.StudentService;
import com.web.study.dto.DataResponseDto;
import com.web.study.dto.ResponseDto;
import com.web.study.dto.request.student.StudentReqDto;

@RestController
public class StudentController {
	@Autowired
	public StudentService studentService ;
	@PostMapping("/student")
	public ResponseEntity<? extends ResponseDto> register(@RequestBody StudentReqDto studentReqDto) {
	studentService.registStudent(studentReqDto);
	System.out.println(studentReqDto);

		return ResponseEntity.ok().body(ResponseDto.ofDefault());
	}
	
	@CheckNameAspect
	@GetMapping("/students")
	public ResponseEntity<? extends ResponseDto> getStudentAll() {
		
		return ResponseEntity.ok().body(DataResponseDto.of(studentService.getStudentAll()));
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<? extends ResponseDto> getStudentById(@PathVariable int id) {
		
		return ResponseEntity.ok().body(DataResponseDto.of(studentService.getStudentById(id)));
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
