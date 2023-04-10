package com.web.study.controller.Lecture;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.Service.LecturerService;
import com.web.study.dto.DataResponseDto;
import com.web.study.dto.ResponseDto;
import com.web.study.dto.request.lecturer.LecturerReqDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class LecturerController {
	public final LecturerService lecturerService;
	// Create
		@PostMapping("/lecturer")
		public ResponseEntity<? extends ResponseDto> register(@RequestBody LecturerReqDto lecturerReqDto) {
			lecturerService.registLecturer(lecturerReqDto);

			return ResponseEntity.ok().body(ResponseDto.ofDefault());
		}
		@GetMapping("lecturers")
		public ResponseEntity<? extends ResponseDto> getlecturers() {
			
			return ResponseEntity.ok().body(DataResponseDto.of(lecturerService.getLectureAll()));
		}
		
		@GetMapping("lecturer/{id}")
		public ResponseEntity<? extends ResponseDto> getlecturerById(@PathVariable int id) {
			
			return ResponseEntity.ok().body(DataResponseDto.of(lecturerService.findLectureById(id)));
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
