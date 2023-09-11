package com.Facebook.com;

import java.io.File;
//import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;

public class FacebookLauncher {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi Dharshini\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Ravi Dharshini\\eclipse-workspace\\MavenProject\\ScreenShots\\fb.png");
		
		FileUtils.copyFile(source, dest);
		
		//FileHandler.copy(source, dest);
		
		System.out.println("https://www.facebook.com/ is launched");
	}

}
