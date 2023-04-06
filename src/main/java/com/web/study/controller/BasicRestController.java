package com.web.study.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.dto.BasicTestDto;
import com.web.study.dto.DataResponseDto;
import com.web.study.dto.ResponseDto;

import lombok.Data;



@RestController
public class BasicRestController {
//	GET 요청의 param을 처리하는 방법
	@GetMapping("/read")
	public ResponseEntity<? extends ResponseDto> read(BasicTestDto basicTestDto)
	{
//		변수가 여러가지 일 경우 클래스로 만들어서 getter를 사용해서 들고올 수 있음
		String userInfo =  basicTestDto.getName() + "(" + basicTestDto.getAge() + ")";
		
		return ResponseEntity.ok().body(DataResponseDto.of(userInfo));
	}
	
	@GetMapping("/read2/{id}")
	public ResponseEntity<? extends ResponseDto> read2(@PathVariable("id") int userId) {
		Map<Integer, String> userMap = new HashMap<>();
		userMap.put(1, "일상현");
		userMap.put(2, "이상현");
		userMap.put(3, "삼상현");
		userMap.put(4, "사상현");
		userMap.put(5, "오상현");
		
		return ResponseEntity.ok().body(DataResponseDto.of(userMap.get(userId)));
	}
	@PostMapping("/create")
//	Json 데이터로 받을때는 @RequestBody를 해줘야하고
//	form 데이터로 받을때는 없어야함
	public ResponseEntity<? extends ResponseDto> create(@RequestBody BasicTestDto basicTestDto) {
		System.out.println("데이터 추가");
		return ResponseEntity.created(null).body(DataResponseDto.of(basicTestDto));
	}
	
	@GetMapping("/test")
	public ResponseEntity<? extends ResponseDto> read3(String name, String username, int id) {
		String userInfo = username + " : " + name + " : " + id;
		return ResponseEntity.ok().body(DataResponseDto.of(userInfo));
	}
	
}

//public class BasicRestController {
////	GET 요청의 param을 처리하는 방법
//	@GetMapping("/read")
//	public ResponseEntity<? extends ResponseDto> read(int age, String name)
//	{
//		String userInfo = name + "(" + age + ")";
//		
//		return ResponseEntity.ok().body(DataResponseDto.of(userInfo));
//	}
//}
	

//	public ResponseEntity<? extends ResponseDto> read(
//	@RequestParam("age") int userAge,
//	@RequestParam("name") String userName)
//			@RequestParam("age") int userAge,
//			@RequestParam("name") String userName)
//	@RequestParam을 사용하면 변수로 지정 가능함
// 그런데 read안에다가 파라미터값을 변수로 저장해주면 바로 사용 가능
	
