package com.Facebook.com;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.base.com.BaseClass;

public class FacebookLaunchWithBase extends BaseClass{
	
	public static WebDriver driver; //null
	
	public static void main(String[] args) throws IOException {
	
		browserLaunch("edge");
		launchUrl("https://www.instagram.com/");
		capture();
		
		
	}

}
