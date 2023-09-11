package com.adactin;

import org.openqa.selenium.WebDriver;

import com.ebase.com.EBase;
import com.pageobjectmanager.PageObjectManager;

public class Adactin_POManager extends EBase{
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = browserLaunch("Chrome");
		launchUrl("https://adactinhotelapp.com/index.php");
		implicitWait();
		
		PageObjectManager pom = new PageObjectManager(driver);
		
		//LOGIN
		
		pom.getLogin().getUsername().sendKeys("ThorRang");
		pom.getLogin().getPassword().sendKeys("dcVSmar");
		pom.getLogin().getLogin().click();
		
		//SEARCHHOTEL
		singleDropDown(pom.getSearch().getLocation(), "value", "Melbourne");
		singleDropDown(pom.getSearch().getHotels(), "value", "Hotel Cornice");
		singleDropDown(pom.getSearch().getRoomType(), "value", "Deluxe");
		singleDropDown(pom.getSearch().getNoOfRooms(), "value", "1");
		pom.getSearch().getCheckIn().clear();
		sendValues(pom.getSearch().getCheckIn(), "18/07/2022");
		pom.getSearch().getCheckOut().clear();
		sendValues(pom.getSearch().getCheckOut(), "20/07/2022");
		singleDropDown(pom.getSearch().getAdults(), "value", "3");
		singleDropDown(pom.getSearch().getChildren(), "value", "0");
		clickOnElement(pom.getSearch().getSearch());
		
		//SELECTHOTEL
		clickOnElement(pom.getSelect().getRadio());
		clickOnElement(pom.getSelect().getNext());
		
		//BOOKAHOTEL
		sendValues(pom.getHotel().getFirstName(), "Thor");
		sendValues(pom.getHotel().getLastName(), "Rang");
		sendValues(pom.getHotel().getBilladdress(), "Marvel Space");
		sendValues(pom.getHotel().getCardno(), "8596321475214003");
		singleDropDown(pom.getHotel().getCardtype(), "value", "MAST");
		singleDropDown(pom.getHotel().getExpmonth(), "value", "4");
		singleDropDown(pom.getHotel().getExpyear(), "value", "2022");
		sendValues(pom.getHotel().getCvv(), "444");
		clickOnElement(pom.getHotel().getOk());
		
		//BOOKINGCONFIRMATION
		clickOnElement(pom.getbook().getItinerary());
		
		//LOGOUT
		clickOnElement(pom.getIti().getLogout());
		
	}

}
