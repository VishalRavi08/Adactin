package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_SimpleAnnotations{

	@BeforeSuite
	public void setup() {
		System.out.println("System set property");
	}

	@BeforeTest
	public void browserLaunch() {
		System.out.println("Chrome Browser");
	}

	@BeforeClass
	public void launchUrl() {
		System.out.println("Launch Amazon Application");
	}

	@BeforeMethod
	public void login() {
		System.out.println("Login");
	}

	@Test
	public void searchHp() {
		System.out.println("HP Laptops");
	}

	@Test
	public void searchIphone() {
		System.out.println("Iphone");
	}

	@AfterMethod
	public void verifyHomepage() {
		System.out.println("Verify");
	}

	@AfterClass
	public void logout() {
		System.out.println("Logout");
	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("Close Browser");
	}

	@AfterSuite
	public void deleteCookies() {
		System.out.println("Delete Cookies");
	}

}
