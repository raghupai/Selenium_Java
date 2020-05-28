package com.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo02_WorkingWithIE {

	WebDriver driver;
	String url = "http://newtours.demoaut.com/";
	String driverPath = "/Users/raghuveer/Desktop/SeleniumDrivers/";
 
	@Before
	public void setUp() {
	//Set the key/value property according to the browser you are using.
    //System.setProperty("webdriver.chrome.driver",driverPath+"chromedriver"); 
 
    //Open browser instance
    driver = new ChromeDriver();
		
		//Open the AUT
		driver.get(url);
	}
 
	@Test
	public void test() {
		//Fetch the page title
		String pageTitle = driver.getTitle();
		System.out.println("Page title: " + pageTitle);
	}
 
	@After
	public void tearDown() {
		//Close the browser
		driver.close();
	}

}
