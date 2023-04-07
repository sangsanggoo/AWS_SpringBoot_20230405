package com.web.study.IocAndDi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class IocTest2 {
//	지금 testA와 testB에 컴포넌트를 해놔서
//	여기서 autowired가 test를 생성할수 있는것이
//	생성자에서
//	this.test = Test test(new testA());
//	this.test = Test test(new testB());
//	2가지라서 Qualifier로 둘중 멀로 할지 정해주면
//	컴파일에서 오류가 나지 않음
	@Autowired
	@Qualifier("testC")
	private Test test;
//	public IocTest(Test test) {
//		this.test = test;
//
//	}
	public void run() {
		System.out.println("IoCTest2 출력!!!");
		test.printTest();
	}
	// 밖에서 변수를 넣어줄때마다 다르게 적용됨
	
}
