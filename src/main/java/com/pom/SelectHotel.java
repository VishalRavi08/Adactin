package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	
	WebDriver selectdriver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radio;
	
	@FindBy(id = "continue")
	private WebElement next;
	
	public WebElement getRadio() {
		return radio;
	}

	public WebElement getNext() {
		return next;
	}

	public SelectHotel(WebDriver driver) {
		selectdriver = driver;
		PageFactory.initElements(selectdriver, this);
	}
	
	

}
