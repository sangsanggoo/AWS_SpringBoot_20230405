package com.web.study.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.web.study.Repository.UserRepository;
import com.web.study.domain.entity.User;
import com.web.study.exception.CustomException;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class PrincipalDetailsService implements UserDetailsService {
	
	private final UserRepository userRepository;
	
	
//	UserDetailsService에 있는 메소드임 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User userEntity = userRepository.findUserByUsername(username);
		
		if(userEntity == null) {
			throw new CustomException("사용자 정보를 다시 확인해보세요");
		}
		return userEntity.toPrincipal();
	}
}
