package com.guru;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG21 {
	public static void main(String[] args) throws InterruptedException {
		String driverPath = "/Users/raghuveer/Desktop/SeleniumDrivers/";
		System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver");
		WebDriver driver = new FirefoxDriver();

		// Launching the site.
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

		String MainWindow = driver.getWindowHandle();
		System.out.println(MainWindow);

		// To handle all new opened window.
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();

		System.out.println(s1.size());

		for (String windows : s1) {
			driver.switchTo().window(windows);

			if (!MainWindow.equalsIgnoreCase(driver.getWindowHandle())) {

				// Switching to Child window
				System.out.println("Inside Child Window");
				driver.switchTo().window(windows);
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");

				driver.findElement(By.name("btnLogin")).click();
				System.out.println("Inside Child Window");
				// Closing the Child Window.
				driver.close();
			}
		}
		// Switching to Parent window i.e Main Window.
		driver.switchTo().window(MainWindow);

		driver.quit();
	}

}
