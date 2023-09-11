package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.BookAHotel;
import com.pom.BookingConfirmation;
import com.pom.Itinerary;
import com.pom.Login;
import com.pom.SearchHotel;
import com.pom.SelectHotel;

public class PageObjectManager {

	//Declare the POM(Page Object Model) class objects as private
	//Generate Getters
	//Initialize using constructor of Page Object Model
	
	WebDriver driver; 
	
	private Login login; //return type of object is class name
	private SearchHotel search;
	private SelectHotel select;
	private BookAHotel hotel;
	private BookingConfirmation book;
	private Itinerary iti;
	
	public Login getLogin() {
		login = new Login(driver); //initialization
		return login;
	}
	
	public SearchHotel getSearch() {
		search = new SearchHotel(driver);//initialization
		return search;
	}
	
	public SelectHotel getSelect() {
		select = new SelectHotel(driver); //initialization
		return select;
	}
	
	public BookAHotel getHotel() {
		hotel = new BookAHotel(driver); //initialization
		return hotel;
	}
	
	public BookingConfirmation getbook() {
		book = new BookingConfirmation(driver); //initialization
		return book;
	}
	
	public Itinerary getIti() {
		iti = new Itinerary(driver); //initialization
		return iti;
	}
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, driver);
	}
	
	
	
}
