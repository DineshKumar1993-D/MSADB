package com.testng;

import org.testng.annotations.Test;

public class TestP {
	
	@Test(priority = -1)
	private void mobileNmae() {
		System.out.println("SetProperty");

	}

	@Test(priority = 2)
	private void mobileColor() {

		System.out.println("Chrome Browser");
	}

	@Test(priority = 3)
	private void mobileId() {

		System.out.println("url Launch");
	}

	@Test(priority = -4)
	private void mobileModel() {

		System.out.println("Login");
	}

}
