package com.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Demo09_DragNDrop {

	WebDriver driver;
	String url = "https://phptravels.com/demo/";
	String driverPath = "/Users/raghuveer/Desktop/SeleniumDrivers/";

	@Before
	public void setUp() {
		// Set the key/value property according to the browser you are using.
		// Open browser instance
		// Open the AUT
		// Declare an implicit wait which is bounded to WebDriver instance
	}

	@Test
	public void test() throws InterruptedException {
		// Fetch the element property which should be dragged by using element locator
		WebElement fromElement = driver.findElement(By.id("draggable"));

		// Fetch the element property where the dragged element should get released by
		// using element locator
		WebElement toElement = driver.findElement(By.id("droppable"));

		// Create a reference for Actions class
		Actions action = new Actions(driver);

		// Use dragAndDrop method and provide arguements as the from element and to
		// element
		action.dragAndDrop(fromElement, toElement).perform();

		// Post drag fetch the status message and compare for successful verification
		String afterDragging = driver.findElement(By.xpath("html/body/form/div[4]/div/div[2]/div/p")).getText();

		if (afterDragging.equals("Dropped!"))
			System.out.println("Drag successful.");
		else
			System.out.println("Drag Unsuccessful.");
	}

	@After
	public void tearDown() {
		// Close the browser
	}
}
