package com.bstepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.Base_Class;
import com.pom.Login_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base_Class {
	
//	public static WebDriver driver;
	public static Login_Page log;

	@Given("^user Launch Url Of The Facebook Application$")
	public void user_Launch_Url_Of_The_Facebook_Application() throws Throwable {

	//	driver.get("https://www.facebook.com/");
		url_Launch("https://www.facebook.com/");
		
	}

	@When("^user Enter The Username In The Respective Field$")
	public void user_Enter_The_Username_In_The_Respective_Field() throws Throwable {

	//	driver.findElement(By.id("email")).sendKeys("Java@123");
		log = new Login_Page(driver);
		sendValues(log.getUsername(), "Java@123");
	}

	@When("^user Enter The Password In The Respective Field$")
	public void user_Enter_The_Password_In_The_Respective_Field() throws Throwable {

		//driver.findElement(By.id("pass")).sendKeys("328768732");
		sendValues(log.getPassword(), "3489783");
	}

	@Then("^user Clicks The Loginbutton and Its Navigates To The Homepage$")
	public void user_Clicks_The_Loginbutton_and_Its_Navigates_To_The_Homepage() throws Throwable {

	//	driver.findElement(By.name("login")).click();
		clickOnElement(log.getLoginButton());
	}

}
