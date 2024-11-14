package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Test {
	
	@Test
	private void mobileNmae() {
		System.out.println("Vivo");

	}

	@Ignore
	@Test
	private void mobileColor() {

		System.out.println("Black");
	}

	@Test(enabled=false)
	private void mobileId() {

		System.out.println("89374893789");
	}

	@Test
	private void mobileModel() {

		System.out.println("V29");
	}

}
