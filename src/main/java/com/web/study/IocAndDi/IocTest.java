package com.web.study.IocAndDi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class IocTest {
//	지금 testA와 testB에 컴포넌트를 해놔서
//	여기서 autowired가 test를 생성할수 있는것이
//	생성자에서
//	this.test = Test test(new testA());
//	this.test = Test test(new testB());
//	2가지라서 Qualifier로 둘중 멀로 할지 정해주면
//	컴파일에서 오류가 나지 않음
	@Autowired
	@Qualifier("t1") // component 단곳에서 이름을 바꿔줄수 있음
	private Test test;
	

	// TestA에만 component를 달아주고
	// @Autowired를 달아주면
	// 생성자에서 자동으로 
	//	test = new Test(new testA()); 로 만들어주게 되고
	// 그러면 밑에 test.printTest(); 에서는 TestA클래스가 실행이 되게 된다.
	
	
//	public IocTest(Test test) {
//		this.test = test;
//
//	}
	public void run() {
		System.out.println("IoCTest 출력!!!");
		
		test.printTest();
	}
	// 밖에서 변수를 넣어줄때마다 다르게 적용됨
	
}
