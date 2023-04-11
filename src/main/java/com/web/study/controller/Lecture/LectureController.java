package com.web.study.controller.Lecture;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.Service.LectureService;
import com.web.study.dto.DataResponseDto;
import com.web.study.dto.ResponseDto;
import com.web.study.dto.request.lecture.LectureReqDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class LectureController {
	
	private final LectureService lectureService;
	
	
	// Create
	@PostMapping("/lecture")
	public ResponseEntity<? extends ResponseDto> register(@RequestBody LectureReqDto lectureReqDto) {
//		postman에서 lectureDto형식의 JSON을 보내준다
		lectureService.registLecture(lectureReqDto);
//		lectureSerivce(인터페이스)의 LectureserviceImpl이 IOC로 자동생성이된 후
//		lectureServiceImpl로 가서 다음 설명

		return ResponseEntity.ok().body(ResponseDto.ofDefault());
	}
	
	@GetMapping("/lectures")
	public ResponseEntity<? extends ResponseDto> getLectureAll() {
		return ResponseEntity.ok().body(DataResponseDto.of(lectureService.getLectureAll()));
	}
	@GetMapping("/lecture/{id}")
	public ResponseEntity<? extends ResponseDto> getLectureById(@PathVariable int id) {
		return ResponseEntity.ok().body(DataResponseDto.of(lectureService.findLectureById(id)));
	}
	
	@GetMapping("/search/lectures")
	public ResponseEntity<? extends ResponseDto> searchLecture(int type,String searchValue) {
		return ResponseEntity.ok().body(DataResponseDto.of(lectureService.searchLecture(type,searchValue)));
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
