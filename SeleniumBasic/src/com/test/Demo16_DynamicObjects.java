package com.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo16_DynamicObjects {

	WebDriver driver;
	String url = "app_url";

	@Before
	public void setUp() throws Exception {
		// Set the key/value property according to the browser you are using.
		// Open browser instance
		// Open the AUT
	}

	@Test
	public void test() {
		// Create an explicit wait for a maximum of 20seconds
		WebDriverWait wait = new WebDriverWait(driver, 20);

		// Wait for the label corresponding to Object to get visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lblMessage5")));

		// Once the element is visible fetch the test and print it in the console
		String lblDC = driver.findElement(By.id("lblMessage5")).getText();
		System.out.println("DC Name: " + lblDC);
	}

	@After
	public void tearDown() {
		// Close the browser
	}
}
