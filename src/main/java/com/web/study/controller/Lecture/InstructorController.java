package com.web.study.controller.Lecture;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.Service.InstructorService;
import com.web.study.dto.DataResponseDto;
import com.web.study.dto.ResponseDto;
import com.web.study.dto.request.lecturer.InstructorReqDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class InstructorController {
	public final InstructorService instructorService;
	// Create
		@PostMapping("/instructor")
		public ResponseEntity<? extends ResponseDto> register(@RequestBody InstructorReqDto instructorReqDto) {
			instructorService.registInstructor(instructorReqDto);

			return ResponseEntity.ok().body(ResponseDto.ofDefault());
		}
		@GetMapping("instructors")
		public ResponseEntity<? extends ResponseDto> getinstructors() {
			
			return ResponseEntity.ok().body(DataResponseDto.of(instructorService.getInstructorAll()));
		}
		
		@GetMapping("instructor/{id}")
		public ResponseEntity<? extends ResponseDto> getinstructorById(@PathVariable int id) {
			
			return ResponseEntity.ok().body(DataResponseDto.of(instructorService.findInstructorById(id)));
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
