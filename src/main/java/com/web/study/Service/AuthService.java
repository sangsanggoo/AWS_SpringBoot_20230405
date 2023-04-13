package com.web.study.Service;

import com.web.study.domain.entity.Authority;
import com.web.study.dto.request.auth.LoginReqDto;
import com.web.study.dto.request.auth.RegistUserReqDto;
import com.web.study.dto.response.auth.JwtTokenRespDto;

public interface AuthService {
	public void registUser(RegistUserReqDto registUserReqDto);
	public void duplicatedUsername(RegistUserReqDto registUserReqDto); //username 중복 확인
	
	public JwtTokenRespDto login(LoginReqDto loginReqDto);
}
