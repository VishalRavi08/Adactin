package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	//1.Declare the elements as private using @FindBy annotation
	//2.Generate Getters
	//3.Inside the Constructor initialize the driver and elements using PageFactory.initElements
	
	WebDriver driver;
	
	//WebElement username = driver.findElement(By.id(""));
	
	@FindBy(id = "username")
	private WebElement username;		//declaration
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login")
	private WebElement login;
	
	public WebElement getUsername() {
		return username;				//return
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public Login(WebDriver driver) {	//each class should have it's driver
		
	this.driver = driver;
		
	PageFactory.initElements(this.driver, this);  //initializing elements
		
	}
	
}
