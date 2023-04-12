package com.web.study.IocAndDi.Di연습;

public class testNum {
	Number number ;
	public testNum(Number number) {
		this.number = number;
	}
	public void printNum() {
		number.printNum();
	}
}
