package com.guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG22 {
	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/test/write-xpath-table.html";
		String driverPath = "/Users/raghuveer/Desktop/SeleniumDrivers/";
		System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver");
		WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);
		String innerText = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();
		System.out.println(innerText);
		driver.quit();
	}
}
