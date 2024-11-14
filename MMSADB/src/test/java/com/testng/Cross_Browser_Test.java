package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cross_Browser_Test {

	public static WebDriver driver;
	@Parameters("Browser")
	@BeforeClass
	private void browserLaun(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

	}
	
	@Test
	private void loginIntoFacebook() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Java@123");
		driver.findElement(By.id("pass")).sendKeys("33323");
		driver.findElement(By.name("login")).click();
	}
}
