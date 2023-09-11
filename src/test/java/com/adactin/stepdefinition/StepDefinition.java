package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.adactin.runner.AdactinRunner;
import com.ebase.com.EBase;
import com.pageobjectmanager.PageObjectManager;
import com.reader.FileReaderManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends EBase{
	
	WebDriver driver = AdactinRunner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user Launchs The Adactin Application$")
	public void user_Launchs_The_Adactin_Application() throws Throwable {
//	    throw new PendingException();
	    String url = FileReaderManager.getInstanceFR().getInstanceCR().getUrl();
	    launchUrl(url);
	    
	}

	@When("^user Enters The Username In The InputBox$")
	public void user_Enters_The_Username_In_The_InputBox() throws Throwable {
//	    throw new PendingException();
	    sendValues(pom.getLogin().getUsername(), "ThorRang");
	}

	@When("^user Enters The Password In The InputBox$")
	public void user_Enters_The_Password_In_The_InputBox() throws Throwable {
//	    throw new PendingException();
		sendValues(pom.getLogin().getPassword(), "dcVSmar");
	}

	@Then("^user Clicks The LoginButton And It Navigates To the SearchHotelPage$")
	public void user_Clicks_The_LoginButton_And_It_Navigates_To_the_SearchHotelPage() throws Throwable {
//	    throw new PendingException();
		clickOnElement(pom.getLogin().getLogin());
	}

	@When("^user Selects The Location From The Dropdown$")
	public void user_Selects_The_Location_From_The_Dropdown() throws Throwable {
//	    throw new PendingException();
		singleDropDown(pom.getSearch().getLocation(), "value", "Melbourne");
	}

	@When("^user Selects The Hotels From The Dropdown$")
	public void user_Selects_The_Hotels_From_The_Dropdown() throws Throwable {
//	    throw new PendingException();
		singleDropDown(pom.getSearch().getHotels(), "value", "Hotel Cornice");		
	}

	@When("^user Selects The RoomType From The Dropdown$")
	public void user_Selects_The_RoomType_From_The_Dropdown() throws Throwable {
//	    throw new PendingException();
		singleDropDown(pom.getSearch().getRoomType(), "value", "Deluxe");
	}

	@When("^user Selects The NumberOfRooms From The Dropdown$")
	public void user_Selects_The_NumberOfRooms_From_The_Dropdown() throws Throwable {
//	    throw new PendingException();
		singleDropDown(pom.getSearch().getNoOfRooms(), "value", "1");
	}

	@When("^user Enters The CheckInDate In The InputBox$")
	public void user_Enters_The_CheckInDate_In_The_InputBox() throws Throwable {
//	    throw new PendingException();
		pom.getSearch().getCheckIn().clear();
		sendValues(pom.getSearch().getCheckIn(), "18/07/2022");
	}

	@When("^user Enters The CheckOutDate In The InputBox$")
	public void user_Enters_The_CheckOutDate_In_The_InputBox() throws Throwable {
//	    throw new PendingException();
		pom.getSearch().getCheckOut().clear();
		sendValues(pom.getSearch().getCheckOut(), "20/07/2022");
	}

	@When("^user Selects The AdultsPerRoom From The Dropdown$")
	public void user_Selects_The_AdultsPerRoom_From_The_Dropdown() throws Throwable {
//	    throw new PendingException();
		singleDropDown(pom.getSearch().getAdults(), "value", "3");
	}

	@When("^user Selects The ChildrenPerRoom From The Dropdown$")
	public void user_Selects_The_ChildrenPerRoom_From_The_Dropdown() throws Throwable {
//	    throw new PendingException();
		singleDropDown(pom.getSearch().getChildren(), "value", "0");
	}

	@Then("^user Clicks The SearchButton And It Navigates To The SelectHotelPage$")
	public void user_Clicks_The_SearchButton_And_It_Navigates_To_The_SelectHotelPage() throws Throwable {
//	    throw new PendingException();
		clickOnElement(pom.getSearch().getSearch());
	}

	@When("^user Selects The RadioButton$")
	public void user_Selects_The_RadioButton() throws Throwable {
//	    throw new PendingException();
		clickOnElement(pom.getSelect().getRadio());
	}

	@Then("^user Clicks The ContinueButton And It Navigates To The BookAHotelPage$")
	public void user_Clicks_The_ContinueButton_And_It_Navigates_To_The_BookAHotelPage() throws Throwable {
//	    throw new PendingException();
		clickOnElement(pom.getSelect().getNext());
	}

	@When("^user Enters The Firstname In The InputBox$")
	public void user_Enters_The_Firstname_In_The_InputBox() throws Throwable {
//	    throw new PendingException();
		sendValues(pom.getHotel().getFirstName(), "Thor");
	}

	@When("^user Enters The Lastname In The InputBox$")
	public void user_Enters_The_Lastname_In_The_InputBox() throws Throwable {
//	    throw new PendingException();
		sendValues(pom.getHotel().getLastName(), "Rang");
	}

	@When("^user Enters The BillingAddress In The InputBox$")
	public void user_Enters_The_BillingAddress_In_The_InputBox() throws Throwable {
//	    throw new PendingException();
		sendValues(pom.getHotel().getBilladdress(), "Marvel Space");
	}

	@When("^user Enters The CreditCardNo In The InputBox$")
	public void user_Enters_The_CreditCardNo_In_The_InputBox() throws Throwable {
//	    throw new PendingException();
		sendValues(pom.getHotel().getCardno(), "8596321475214003");
	}

	@When("^user Selects The CreditCardType From The Dropdown$")
	public void user_Selects_The_CreditCardType_From_The_Dropdown() throws Throwable {
//	    throw new PendingException();
		singleDropDown(pom.getHotel().getCardtype(), "value", "MAST");
	}

	@When("^user Selects The ExpiryMonth From The Dropdown$")
	public void user_Selects_The_ExpiryMonth_From_The_Dropdown() throws Throwable {
//	    throw new PendingException();
		singleDropDown(pom.getHotel().getExpmonth(), "value", "4");
	}

	@When("^user Selects The ExpiryYear From The Dropdown$")
	public void user_Selects_The_ExpiryYear_From_The_Dropdown() throws Throwable {
//	    throw new PendingException();
		singleDropDown(pom.getHotel().getExpyear(), "value", "2022");
	}

	@When("^user Enters The CVVNumber In The InputBox$")
	public void user_Enters_The_CVVNumber_In_The_InputBox() throws Throwable {
//	    throw new PendingException();
		sendValues(pom.getHotel().getCvv(), "444");
	}

	@Then("^user Clicks The BookNowButton And It Navigates To The BookingConfirmationPage$")
	public void user_Clicks_The_BookNowButton_And_It_Navigates_To_The_BookingConfirmationPage() throws Throwable {
	 //	    throw new PendingException();
		clickOnElement(pom.getHotel().getOk());
	}

	@Then("^user Clicks The MyItineraryButton And It Navigates To The BookedItineraryPage$")
	public void user_Clicks_The_MyItineraryButton_And_It_Navigates_To_The_BookedItineraryPage() throws Throwable {
//	  	    throw new PendingException();
		implicitWait();
		clickOnElement(pom.getbook().getItinerary());
	}
	
	@When("^user Clicks The LogoutButton And Nagivates To The LoginAgainPage$")
	public void user_Clicks_The_LogoutButton_And_Nagivates_To_The_LoginAgainPage() throws Throwable {
//	    throw new PendingException();
		clickOnElement(pom.getIti().getLogout());
	}
	
}
