package com.guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG13 {
	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/test/accessing-link.html";
		String driverPath = "/Users/raghuveer/Desktop/SeleniumDrivers/";
		System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);
		driver.findElement(By.partialLinkText("here")).click();
		System.out.println("Title of page is: " + driver.getTitle());

		driver.quit();
	}

}
