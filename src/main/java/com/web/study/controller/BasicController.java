package com.web.study.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.dto.DataResponseDto;


// @controller는 무조건 view를 return
// @restcontroller는 무조건 데이터를 return

// ResponseBody viewresolve로 보내지 않고 바로 데이터로 보내버림
// responseBody를 매번 적지 않기 위해서 restcontroller가 나온것
// GetMapping 요청이 들어오는 주소

// 

@RestController
public class BasicController {
	
//	@ResponseBody
	@GetMapping("/view/test")
	public ResponseEntity<DataResponseDto<?>> view() {
		List<String> strList = new ArrayList<>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		// 이렇게 보내는게 응답 인터페이스
		return ResponseEntity.ok(DataResponseDto.of(strList));
//		return ResponseEntity.badRequest().body(DataResponseDto.of(strList)); 
	}
}
