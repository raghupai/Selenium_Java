package com.guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG24 {
	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String driverPath = "/Users/raghuveer/Desktop/SeleniumDrivers/";
		System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);
		String innerText = driver.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[3]/td")).getText();
		System.out.println(innerText);
		driver.quit();
	}

}
