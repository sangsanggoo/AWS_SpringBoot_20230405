package com.web.study.IocAndDi;

import org.springframework.stereotype.Component;

@Component
public class TestB implements Test{
	@Override
	public void printTest() {
		// TODO Auto-generated method stub
		System.out.println("TestB 클래스!!!");
	}
}
