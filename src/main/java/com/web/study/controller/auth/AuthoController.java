package com.web.study.controller.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.Service.AuthService;
import com.web.study.dto.DataResponseDto;
import com.web.study.dto.ResponseDto;
import com.web.study.dto.request.auth.LoginReqDto;
import com.web.study.dto.request.auth.RegistUserReqDto;

@RestController
public class AuthoController {
	@Autowired
	public AuthService authService;
	
	@PostMapping("/auth/register")
	public ResponseEntity<? extends ResponseDto> registe(@RequestBody RegistUserReqDto registUserReqDto) {
		authService.duplicatedUsername(registUserReqDto);
		authService.registUser(registUserReqDto);
		
		return ResponseEntity.ok().body(ResponseDto.ofDefault());
	}
	@PostMapping("/auth/login")
	public ResponseEntity<? extends ResponseDto> login(@RequestBody LoginReqDto loginReqDto) {
//		System.out.println(authService.login(loginReqDto));
		return ResponseEntity.ok().body(DataResponseDto.of(authService.login(loginReqDto)));
	}
	
}
