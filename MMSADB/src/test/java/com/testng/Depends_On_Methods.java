package com.testng;

import org.testng.annotations.Test;

public class Depends_On_Methods {
	
	@Test
	private void mobileName() {
		System.out.println("Chrome");

	}

	@Test(dependsOnMethods = "mobileName")
	private void mobileColor() {

		System.out.println("url");
	}

	@Test(dependsOnMethods = "mobileColor")
	private void mobileId() {

		System.out.println("login");
	}

	@Test(dependsOnMethods = "mobileId")
	private void mobileModel() {

		System.out.println("product search");
	}

}
