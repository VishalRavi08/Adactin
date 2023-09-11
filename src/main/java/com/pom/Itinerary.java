package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itinerary {

	WebDriver itinerarydriver;
	
	@FindBy(id = "logout")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
	
	public Itinerary(WebDriver driver) {
		itinerarydriver = driver;
		PageFactory.initElements(itinerarydriver, this);
	}
	
}
