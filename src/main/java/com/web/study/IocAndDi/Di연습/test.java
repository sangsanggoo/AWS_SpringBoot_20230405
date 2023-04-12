package com.web.study.IocAndDi.Di연습;

public class test {
	private AandB aandb ;
	public test(AandB aandb) {
		this.aandb = aandb;
	}
	public void testprint() {
		aandb.printtest();
	}
}
