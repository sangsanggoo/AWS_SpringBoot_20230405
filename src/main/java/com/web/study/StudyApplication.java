package com.web.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.study.IocAndDi.IocTest;
import com.web.study.IocAndDi.TestA;

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
