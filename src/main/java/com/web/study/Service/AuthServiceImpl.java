package com.web.study.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.web.study.Repository.UserRepository;
import com.web.study.domain.entity.Authority;
import com.web.study.domain.entity.User;
import com.web.study.dto.request.auth.LoginReqDto;
import com.web.study.dto.request.auth.RegistUserReqDto;
import com.web.study.dto.response.auth.JwtTokenRespDto;
import com.web.study.exception.CustomException;
import com.web.study.security.jwt.JwtTokenProvider;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
	
	private final UserRepository userRepository;
	private final AuthenticationManagerBuilder authenticationManagerBuilder;
	private final JwtTokenProvider jwtTokenProvider;
	// 회원 등록
	@Override
	public void registUser(RegistUserReqDto registUserReqDto) {
		User userEntity = registUserReqDto.toEntity();
		userRepository.saveUser(userEntity);
		List<Authority> authorities = new ArrayList<>();
		authorities.add(Authority.builder().user_id(userEntity.getUser_id()).role_id(1).build());
		
		userRepository.addAuthorities(authorities);
	}
	
	// 중복 검사
	@Override
	public void duplicatedUsername(RegistUserReqDto registUserReqDto) {
		User userEntity = userRepository.findUserByUsername(registUserReqDto.getUsername());
		if(userEntity != null) {
			Map<String, String> errorMap = new HashMap<>();
			errorMap.put("username", "이미 사용중인 사용자이름이라고~");
			throw new CustomException("중복 검사 오류",errorMap);
		}
	}
	
	// 로그인
	@Override
	public JwtTokenRespDto login(LoginReqDto loginReqDto) {
		UsernamePasswordAuthenticationToken authenticationToken =
				new UsernamePasswordAuthenticationToken(loginReqDto.getUsername(), loginReqDto.getPassword());
		
		
//		PrincipalDetailsServcie에 만들어준 UserDetailsService의 loadUserByUsername() 호출이 된다.
		Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);
		
		
		return jwtTokenProvider.createToken(authentication);
	}
	
}
