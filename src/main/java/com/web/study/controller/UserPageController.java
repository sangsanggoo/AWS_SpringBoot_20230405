package com.web.study.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.study.dto.DataResponseDto;
import com.web.study.dto.ResponseDto;
import com.web.study.dto.UserAdditionDto;

@Controller
public class UserPageController {
	
	@GetMapping("/page/user/addition")
	public String addUser() {
		return "addUser";
	}
	@GetMapping("/page/user/search")
	public String getUser() {
		return "findUser";
	}
	@GetMapping("/page/users")
	public String getUsers() {
		return "UserList";
	}
	
}
