package com.web.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.IocAndDi.IocTest;
import com.web.study.IocAndDi.IocTest2;

@RestController
public class IocTestController {
	
	//자동으로 iocTest = new IocTest(); 를 시켜주는 역할임
	@Autowired
	private IocTest iocTest;
	@Autowired
	private IocTest2 iocTest2;
	
//	 @Autowired를 안쓰면 이게 필요함 
//	아니면 맨위에 @requiredArgsConstructor를 추가 해주면 final달리것들을 생성자를 자동으로 만들어줌
//	둘중 하나쓰면 가능함
//	public IocTestController(IocTest iocTest,IocTest2 iocTest2 ) {
//		this.iocTest = iocTest;
//		this.iocTest2 = iocTest2;
//	}
	
	
	
	@GetMapping("/ioc/test")
	public Object test() {
		iocTest.run();
		iocTest2.run();
		return null;
	}
}
