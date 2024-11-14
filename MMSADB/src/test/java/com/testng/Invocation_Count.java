package com.testng;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	@Test
	private void mobileNmae() {
		System.out.println("Vivo");

	}

	@Test
	private void mobileColor() {

		System.out.println("Black");
	}

	@Test
	private void mobileId() {

		System.out.println("89374893789");
	}

	@Test(invocationCount = 4)
	private void mobileModel() {

		System.out.println("Login");
	}

}
