package com.adactin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.ebase.com.EBase;
import com.pom.BookAHotel;
import com.pom.BookingConfirmation;
import com.pom.Itinerary;
import com.pom.Login;
import com.pom.SearchHotel;
import com.pom.SelectHotel;
import com.reader.FileReaderManager;

public class Adactin extends EBase {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		driver = browserLaunch("chrome");
//		launchUrl("https://adactinhotelapp.com/index.php");
		
		String url = FileReaderManager.getInstanceFR().getInstanceCR().getUrl();
		launchUrl(url);
		
		implicitWait();
	
		//LOGIN	
		
		Login login = new Login(driver);
		WebElement username = login.getUsername();
		sendValues(username, "ThorRang");
		sendValues(login.getPassword(), "dcVSmar");
		clickOnElement(login.getLogin());
		
		//SEARCHHOTEL
		
		SearchHotel search = new SearchHotel(driver);
		singleDropDown(search.getLocation(), "value", "Melbourne");
		singleDropDown(search.getHotels(), "value", "Hotel Cornice");
		singleDropDown(search.getRoomType(), "value", "Deluxe");
		singleDropDown(search.getNoOfRooms(), "value", "1");
		search.getCheckIn().clear();
		sendValues(search.getCheckIn(), "18/07/2022");
		search.getCheckOut().clear();
		sendValues(search.getCheckOut(), "20/07/2022");
		singleDropDown(search.getAdults(), "value", "3");
		singleDropDown(search.getChildren(), "value", "0");
		clickOnElement(search.getSearch());
		
		//SELECTHOTEL
		
		SelectHotel select = new SelectHotel(driver);
		clickOnElement(select.getRadio());
		clickOnElement(select.getNext());
		
		//BOOKAHOTEL
		BookAHotel book = new BookAHotel(driver);
		sendValues(book.getFirstName(), "Thor");
		sendValues(book.getLastName(), "Odin");
		sendValues(book.getBilladdress(), "Thor Galaxy");
		sendValues(book.getCardno(), "9876543210000111");
		singleDropDown(book.getCardtype(), "value", "MAST");
		singleDropDown(book.getExpmonth(), "value", "4");
		singleDropDown(book.getExpyear(), "value", "2022");
		sendValues(book.getCvv(), "444");
		clickOnElement(book.getOk());
		
//		WebElement orderNo = driver.findElement(By.id("order_no"));
//		orderNo.getText();
		
		capture();
		
		//BOOKINGCONFIRMATION
		BookingConfirmation confirm = new BookingConfirmation(driver);
		clickOnElement(confirm.getItinerary());
				
		//ITINERARY
		Itinerary i = new Itinerary(driver);
		clickOnElement(i.getLogout());
		
//		System.out.println("Order No: " + orderNo);
		
	}

}
