package com.web.study.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PrincipalUserDetails implements UserDetails{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1913596722176708482L;
	
	
	private int userId;
	private String username;
	private String password;
	private List<String> roles;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		roles.forEach(role -> {
			authorities.add(new SimpleGrantedAuthority(role));
		});
		return authorities;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}
	// 사용기간 만료
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	// 계정 잠궈버림
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	// 비밀번호 5회 틀렸을 때
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	// 계정 비활성 상태(이메일 인증을 완료해야하거나, 전화번호 인증을 하지 않았을때)
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
}
