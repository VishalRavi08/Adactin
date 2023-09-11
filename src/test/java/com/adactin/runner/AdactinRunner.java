package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.ebase.com.EBase;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@RunWith	//@CucumberOptions	//BeforeClass	//AfterClass

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature", 
				 glue="com.adactin.stepdefinition", monochrome=true ,
				 plugin={"pretty", 
						 "html:Report/Cucumber_Report", 
						 "json:Report/Cucumber.json", 
						 "com.cucumber.listener.ExtentCucumberFormatter:Report/CucumberExtentReport.html"},
				 strict = true, tags="@smoketest")

public class AdactinRunner extends EBase{
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		driver = browserLaunch("Chrome");
	}
	
	@AfterClass
	public static void tearDown() {
		x();
	}

}
