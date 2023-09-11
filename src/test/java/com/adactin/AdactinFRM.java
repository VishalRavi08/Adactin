package com.adactin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ebase.com.EBase;
import com.pom.Login;
import com.reader.FileReaderManager;

public class AdactinFRM extends EBase{ 
	
	//FRM - FileReaderManager
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
	driver = browserLaunch(FileReaderManager.getInstanceFR().getInstanceCR().broswer());
		
//	driver = browserLaunch("Chrome");	
	
	String url = FileReaderManager.getInstanceFR().getInstanceCR().getUrl();
		
	launchUrl(url);
	
	Login log = new Login(driver);
	
	log.getUsername().sendKeys(FileReaderManager.getInstanceFR().getInstanceCR().userName());
	
	WebElement password = log.getPassword();
	sendValues(password, FileReaderManager.getInstanceFR().getInstanceCR().password());

	clickOnElement(log.getLogin());
	
	}

}
