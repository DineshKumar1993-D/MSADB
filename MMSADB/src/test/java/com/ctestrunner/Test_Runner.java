package com.ctestrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.baseclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//afeaturefile",
					glue="com.bstepdefinition",
					plugin={"pretty",
							"html:target//Html_Report",
							"json:target//Json_Report.json",
	"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"},
				monochrome=true,
			//	tags="@smoketest1",
				dryRun=false,
				strict=false
				)
public class Test_Runner  extends Base_Class{
	
	@BeforeClass
	public static void setUp() {
		// browser launch
		browserLaunch("edge");
	}
	@AfterClass
	public static void tearDown() {
		// close browser
	}

}
