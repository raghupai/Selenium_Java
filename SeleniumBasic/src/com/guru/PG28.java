package com.guru;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG28 {
	public static void main(String[] args) throws ParseException {
		String driverPath = "/Users/raghuveer/Desktop/SeleniumDrivers/";
		System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver");
		WebDriver wd = new FirefoxDriver();

		wd.get("http://demo.guru99.com/test/web-table-element.php");
		String max;
		double m = 0, r = 0;
		String Company = "";

		// No. of Columns
		List<WebElement> col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("Total No of columns are : " + col.size());
		// No.of rows
		List<WebElement> rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("Total No of rows are : " + rows.size());
		for (int i = 1; i < rows.size(); i++) {
			max = wd.findElement(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr[" + (i + 1) + "]/td[4]"))
					.getText();
			/// html/body/div/div[3]/div[1]/table
			NumberFormat f = NumberFormat.getNumberInstance();
			Number num = f.parse(max);
			max = num.toString();
			m = Double.parseDouble(max);
			if (m > r) {
				r = m;
				Company = wd.findElement(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr[" + (i + 1) + "]/td[1]"))
						.getText();
			}
		}
		System.out.println("Maximum current price is : " + r);
		System.out.println("Company Name is :" + Company);

		wd.quit();
	}

}
