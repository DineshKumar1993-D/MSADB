package com.testng;

import org.testng.annotations.Test;

public class Expected_Exception {

	@Test
	private void mobileNmae() {
		System.out.println("Vivo");

	}

	@Test(expectedExceptions = Exception.class)
	private void mobileColor() {
		
		int a = 10 / 0;
		System.out.println(a);
		
		
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
