package com.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	//create a constructor
	//create a file object inside the constructor
	//create FileInputStream object and pass File class object as parameter
	//create Properties class object 
	//load getProperty function and pass FileInputStream object as parameter
	//create Getter method of each key and value (use getProperty("key") and return the value
	
	Properties p = new Properties();
	
	public ConfigurationReader() throws IOException {
		
		File f = new File("C:\\Users\\Ravi Dharshini\\eclipse-workspace\\MavenProject\\Configuration\\config.properties");
		FileInputStream fis = new FileInputStream(f);
//		Properties p = new Properties();
		p.load(fis);
			
	}
	
	public String getUrl() {
		
//		Properties p = new Properties();
		String urlLink = p.getProperty("url");
		return urlLink;
		
	}
	
	public String accNo() {
		
		String accNo = p.getProperty("accNo");
		return accNo;				
	
	}
	
	public String cvv() {
		String cvv = p.getProperty("cvv");
		return cvv;				
	}
	
	public String userName() {
		
		String username = p.getProperty("userName");
		return username;				
	
	}
	
	public String password() {
		
		String password = p.getProperty("password");
		return password;				
	
	}
	
	public String broswer() {
		
		String browser = p.getProperty("browserName");
		return browser;				
	
	}

}
