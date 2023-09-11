package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	WebDriver searchdriver;
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(name = "room_type")
	private WebElement roomType;
	
	@FindBy(name = "room_nos")
	private WebElement noOfRooms;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement checkIn;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement checkOut;
	
	@FindBy(name = "adult_room")
	private WebElement adults;
	
	@FindBy(name = "child_room")
	private WebElement children;
	
	@FindBy(id = "Submit")
	private WebElement search;
	
	public WebElement getSearch() {
		return search;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildren() {
		return children;
	}

	public SearchHotel(WebDriver driver) {
		searchdriver = driver;
		PageFactory.initElements(searchdriver, this);
	}
	
	

}
