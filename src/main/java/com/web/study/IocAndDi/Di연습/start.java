package com.web.study.IocAndDi.Di연습;

public class start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testNum testNum = new testNum(new one());
		testNum.printNum();
		
		testNum testNum2 = new testNum(new two());
		testNum2.printNum();
	}

}
