package com.testng;

import org.testng.annotations.Test;

public class Groping_Test {
	
	@Test(groups = "A")
	private void mobileName() {
		System.out.println("Vivo");

	}

	@Test(groups = "B")
	private void mobileColor() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("Black");
	}

	@Test(groups = {"A","B"})
	private void mobileId() {

		System.out.println("89374893789");
	}


}
