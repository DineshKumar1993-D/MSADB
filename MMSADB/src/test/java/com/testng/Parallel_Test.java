package com.testng;

import org.testng.annotations.Test;

public class Parallel_Test {
	
	@Test
	private void mobileNmae() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Vivo");

	}

	@Test()
	private void mobileColor() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("Black");
	}

	@Test
	private void mobileId() throws InterruptedException {
		Thread.sleep(1500);
		System.out.println("89374893789");
	}


}
