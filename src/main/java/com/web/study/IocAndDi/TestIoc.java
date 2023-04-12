package com.web.study.IocAndDi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class TestIoc {
	@Autowired
	Test test ;

	public void run() {
		test.printTest();
	}
}
