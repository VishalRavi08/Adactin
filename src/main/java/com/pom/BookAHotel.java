package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel {

	WebDriver bookdriver;
	
	@FindBy(name = "first_name")
	private WebElement firstName;
	
	@FindBy(name = "last_name")
	private WebElement lastName;
	
	@FindBy(id = "address")
	private WebElement billaddress;
	
	@FindBy(id = "cc_num")
	private WebElement cardno;
	
	@FindBy(id = "cc_type")
	private WebElement cardtype;
	
	@FindBy(name = "cc_exp_month")
	private WebElement expmonth;
	
	@FindBy(name = "cc_exp_year")
	private WebElement expyear;
	
	@FindBy(name = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(id = "book_now")
	private WebElement ok;

	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getBilladdress() {
		return billaddress;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getOk() {
		return ok;
	}
	
	public BookAHotel(WebDriver driver) {
		bookdriver = driver;
		PageFactory.initElements(bookdriver, this);
		
	}
	
	
	
}
