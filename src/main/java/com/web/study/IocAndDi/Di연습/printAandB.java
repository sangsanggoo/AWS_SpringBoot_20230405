package com.web.study.IocAndDi.Di연습;

public class printAandB {
	public static void main(String[] args) {
		test test = new test(new A());
		test.testprint();
	}
}
