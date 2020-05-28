package com.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo04_LoginLogOut {
	WebDriver driver;
	String url = "http://localhost:8080/PackAndGo_v2/index.html";
	String driverPath = "/Users/raghuveer/Desktop/SeleniumDrivers";

	@Before
	public void setUp() {
		// Set the key/value property according to the browser you are using.
		System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver.exe");

		// Open browser instance
		driver = new FirefoxDriver();

		// Open the AUT
		driver.get(url);
	}

	@Test
	public void test() throws InterruptedException {
		// Click on Login
		driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/a")).click();

		Thread.sleep(2000);
		// Enter the username
		driver.findElement(By.id("usernameLogin")).sendKeys("pgGru");

		// Enter the password
		driver.findElement(By.id("passwordLogin")).sendKeys("freezeray");

		// Click on Login button
		driver.findElement(By.id("login")).click();

		// Fetch the My Dashboard text
		String message = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]")).getText();
		System.out.println(message);

		// Click on logout link
		driver.findElement(By.linkText("LogOut")).click();
	}

	@After
	public void tearDown() {
		// Close the browser
		driver.close();
	}
}
