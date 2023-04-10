package com.web.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication {
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(StudyApplication.class, args);
//		iocAndDiTest();
	}
//	public static void iocAndDiTest() {
//		// IOC(Inversion Of Control) 
//		IocTest iocTest = new IocTest(new TestA());
//		iocTest.run();
//	}
}
