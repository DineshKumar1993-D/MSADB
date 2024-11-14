package com.testng;

import org.testng.annotations.Test;

public class TimeUnit_Test {

	
	@Test
	private void mobileNmae() {
		System.out.println("Vivo");

	}

	@Test(timeOut = 1000)
	private void mobileColor() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("Black");
	}

	@Test
	private void mobileId() {

		System.out.println("89374893789");
	}

	@Test
	private void mobileModel() {

		System.out.println("V29");
	}

}
