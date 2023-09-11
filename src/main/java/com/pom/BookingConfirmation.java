package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation {

	WebDriver confirmdriver;
	
	@FindBy(id = "my_itinerary")
	private WebElement itinerary;

	public WebElement getItinerary() {
		return itinerary;
	}
	
	public BookingConfirmation(WebDriver driver){
		confirmdriver = driver;
		PageFactory.initElements(confirmdriver, this);
	}
	
}
