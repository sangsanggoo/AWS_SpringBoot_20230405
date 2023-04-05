package com.web.study.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 요청을 받을 수 있는 컨트롤러로 만들어줌
@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public Map<String, String> hello(HttpServletRequest request) {
		
		
		String name = request.getParameter("name");
		Map<String, String> testMap = new HashMap<>();
		testMap.put("name", name);
		testMap.put("age", "25");
		testMap.put("address", "부산");
		return testMap;
	}
}
