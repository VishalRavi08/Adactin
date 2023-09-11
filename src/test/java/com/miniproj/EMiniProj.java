package com.miniproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.ebase.com.EBase;

public class EMiniProj extends EBase {

public static WebDriver driver;
	
public static void main(String[] args) throws InterruptedException {
	
//	System.out.println("Enter the browser name: Chrome or Egde");
//	Scanner sc = new Scanner(System.in);
//	String browserName = sc.nextLine();	
	
	driver = browserLaunch("Chrome");
	
	launchUrl("http://automationpractice.com/index.php");
		
	implicitWait();
	
//	registration
		
//		WebElement log = driver.findElement(By.xpath("//a[@class='login']"));
//		clickOnElement(log);
		
//		explicitWait(log);
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(7000);
		
		WebElement email1 = driver.findElement(By.id("email_create"));
		sendValues(email1, "simple0110@gmail.com");
		
		WebElement submit = driver.findElement(By.name("SubmitCreate"));
		clickOnElement(submit);
		
		WebElement gender = driver.findElement(By.id("id_gender1"));
		radio(gender);
		
		WebElement fname = driver.findElement(By.id("customer_firstname"));
		sendValues(fname, "Captain");
		
		WebElement lname = driver.findElement(By.id("customer_lastname"));
		sendValues(lname, "Marvel");
		
		WebElement password = driver.findElement(By.id("passwd"));
		sendValues(password, "caaenf@_35");
		
		WebElement date = driver.findElement(By.id("days"));
		dropdown(date, "6");
		
		WebElement month = driver.findElement(By.id("months"));
		dropdown(month, "8");
		
		WebElement year = driver.findElement(By.id("years"));
		dropdown(year, "1996");
		
		WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		checkBox(checkBox1);
		WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		checkBox(checkBox2);
		
		WebElement fname1 = driver.findElement(By.id("firstname"));
		sendValues(fname1, "Captain");
		
		WebElement lname1 = driver.findElement(By.id("lastname"));
		sendValues(lname1, "Marvel");
		
		WebElement company = driver.findElement(By.id("company"));
		sendValues(company, "RI");
		
		WebElement add1 = driver.findElement(By.id("address1"));
		sendValues(add1, "Bharathi Nagar");
		
		WebElement add2 = driver.findElement(By.id("address2"));
		sendValues(add2, "Bishop College");
		
		WebElement city = driver.findElement(By.id("city"));
		sendValues(city, "Tiruchi");
		
		
		WebElement state = driver.findElement(By.id("id_state"));
		dropdown(state, "New Jersey");
		
		WebElement pin = driver.findElement(By.name("postcode"));
		sendValues(pin, "12121");

		WebElement info = driver.findElement(By.id("other"));
		sendValues(info, "!caution!");
		
		WebElement phn = driver.findElement(By.id("phone"));
		sendValues(phn, "65464648");
		
		WebElement mob = driver.findElement(By.id("phone_mobile"));
		sendValues(mob, "65464648");
		
		WebElement m = driver.findElement(By.id("alias"));
		m.clear();
		sendValues(m, "asfgh@gmail.com");
		
		WebElement ok = driver.findElement(By.name("submitAccount"));
		clickOnElement(ok);
	
	
	}
}
