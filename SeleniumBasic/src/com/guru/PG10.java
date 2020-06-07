package com.guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG10 {

	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/test/link.html";
		String driverPath = "/Users/raghuveer/Desktop/SeleniumDrivers/";
		System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);
		driver.findElement(By.linkText("click here")).click();
		System.out.println("title of page is: " + driver.getTitle());
		driver.quit();
	}

}