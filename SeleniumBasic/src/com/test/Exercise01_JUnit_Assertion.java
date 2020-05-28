package com.test;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise01_JUnit_Assertion {

	WebDriver driver;
	String url = "http://localhost:8080/EDUBank";
	
	@Before
	public void setUp() {
		
		//Set the key/value property according to the browser you are using.
		System.setProperty("webdriver.gecko.driver","/root/Desktop/SupportedFiles/geckodriver.exe");

		//Open browser instance
		driver = new FirefoxDriver();

		//Open the AUT
		driver.get(url);
		
		
	}

}
