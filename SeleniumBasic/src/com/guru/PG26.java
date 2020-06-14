package com.guru;

import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG26 {

	public static void main(String[] args) throws ParseException {
		String driverPath = "/Users/raghuveer/Desktop/SeleniumDrivers/";
		System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver");
		WebDriver wd = new FirefoxDriver();

		wd.get("http://demo.guru99.com/test/web-table-element.php");
		// No.of Columns
		//// *[@id="leftcontainer"]/table
		List<WebElement> col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("No of cols are : " + col.size());
		// No.of rows
		List<WebElement> rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("No of rows are : " + rows.size());
		wd.close();
	}

}
