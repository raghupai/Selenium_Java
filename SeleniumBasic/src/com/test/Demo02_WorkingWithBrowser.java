package com.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class Demo02_WorkingWithBrowser {

	WebDriver driver;
	String url = "https://phptravels.com/demo/";
	String driverPath = "/Users/raghuveer/Desktop/SeleniumDrivers/";
	WebDriverEventListener eventListener;

	@Before
	public void setUp() {
		// Set the key/value property according to the browser you are using.
		System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver");

		// Open browser instance
		driver = new FirefoxDriver();

		// Open the AUT
		driver.get(url);

	}

	@Test
	public void test() {
		// Fetch the page title
		String pageTitle = driver.getTitle();
		System.out.println("Page title: " + pageTitle);
	}

	@After
	public void tearDown() {
		// Close the browser
		driver.close();
	}
}
