package com.guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG14 {
	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String driverPath = "/Users/raghuveer/Desktop/SeleniumDrivers/";
		System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);
		String theLinkText = driver.findElement(By.partialLinkText("egis")).getText();
		System.out.println(theLinkText);
		theLinkText = driver.findElement(By.partialLinkText("EGIS")).getText();
		System.out.println(theLinkText);

		driver.quit();

	}

}
