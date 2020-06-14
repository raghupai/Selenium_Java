package com.guru;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG20 {
	public static void main(String[] args) throws NoAlertPresentException, InterruptedException {
		String driverPath = "/Users/raghuveer/Desktop/SeleniumDrivers/";
		System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver");
		WebDriver driver = new FirefoxDriver();

		// Alert Message handling

		driver.get("http://demo.guru99.com/test/delete_customer.php");

		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.name("submit")).submit();

		// Switching to Alert
		Alert alert = driver.switchTo().alert();

		// Capturing alert message.
		String alertMessage = driver.switchTo().alert().getText();

		// Displaying alert message
		System.out.println(alertMessage);
		Thread.sleep(5000);

		// Accepting alert
		alert.dismiss();

		driver.quit();
	}

}
