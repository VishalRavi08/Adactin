package com.base.com;

import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class BaseClass {
	
	public static WebDriver driver;		
	public static WebDriver browserLaunch(String browserName) {
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi Dharshini\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			}
		
//		else if (browserName.equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.gecko.driver", "");
//			driver = new FirefoxDriver();	
//			}
		
		else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Ravi Dharshini\\eclipse-workspace\\MavenProject\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			}
		
		else {
			System.out.println("Invalid Brower is selected");
		}
		
		driver.manage().window().maximize();
		return driver;
		
	}
	
	 	public static void clickOnElement(WebElement element) {
	 		//element.click();
	 		element.click();
		}
	
	 	public static void sendValues(WebElement element, String values) {
	 		//element.sendKeys("");
	 		element.sendKeys(values);
		}
	
	 	public static void launchUrl(String url) {
	 		//driver.get("url");
	 		driver.get(url);
	 	}

	 	public static void capture() throws IOException {
//	 		TakesScreenshot ts = (TakesScreenshot) driver;
//			File source = ts.getScreenshotAs(OutputType.FILE);
//			File dest = new File("C:\\Users\\Ravi Dharshini\\eclipse-workspace\\MavenProject\\ScreenShots\\fb.png");
//			FileUtils.copyFile(source, dest);
	 		
	 		TakesScreenshot ts = (TakesScreenshot) driver;
	 		File takeAs = ts.getScreenshotAs(OutputType.FILE);
	 		File loc = new File("C:\\Users\\Ravi Dharshini\\eclipse-workspace\\MavenProject\\ScreenShots\\webpage.png");
	 		FileHandler.copy(takeAs, loc);
	 		System.out.println("ScreenShot is taken successfully");
	 	}
	 	
}
