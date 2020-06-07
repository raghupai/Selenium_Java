package com.guru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG3 {
	public static void main(String[] args) {
		String driverPath = "/Users/raghuveer/Desktop/SeleniumDrivers/";
		System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.popuptest.com/popuptest2.html");
		driver.quit(); // using QUIT all windows will close
	}
}