package com.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo17_DealingWithAjaxControl {

	WebDriver driver;
	String url = "https://phptravels.com/demo/";
	String driverPath = "/Users/raghuveer/Desktop/SeleniumDrivers/"; // This URL and scenario is only for reference.

	@Before
	public void setUp() {
		// Set the key/value property according to the browser you are using.
		// Open browser instance
		// Open the AUT
		// Declare an implicit wait which is bounded to WebDriver instance
	}

	@Test
	public void test() throws InterruptedException {
		// Login into the application

		// Employee link
		WebElement linkEmployee = driver.findElement(By.xpath("html/body/form/div[6]/div/div[1]/div[1]/ul/li[4]/a"));

		// Details links --- After hovering Employee link
		WebElement linkDetails = driver
				.findElement(By.xpath("html/body/form/div[6]/div/div[1]/div[1]/ul/li[4]/ul/li[1]/a"));

		// Use the action class to
		Actions action = new Actions(driver);
		action.moveToElement(linkEmployee).moveToElement(linkDetails).click().build().perform();

		// Explicit wait with a maximum of 20seconds
		WebDriverWait wait = new WebDriverWait(driver, 20);

		// Wait until the table gets displayed
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(
				By.id("cphMainContent_tcEmployeeDetails_tpUpdateQualifications_grdQualificationForAdmin"))));

		// click on the edit button in the first row
		driver.findElement(
				By.id("cphMainContent_tcEmployeeDetails_tpUpdateQualifications_grdQualificationForAdmin_btnEdit_0"))
				.click();

		// wait until the row gets converted into a textbox
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
				"cphMainContent_tcEmployeeDetails_tpUpdateQualifications_grdQualificationForAdmin_QualificationDescription_0")));

		// clear the data corresponding to Qualification Description and input some
		// value
		driver.findElement(By.id(
				"cphMainContent_tcEmployeeDetails_tpUpdateQualifications_grdQualificationForAdmin_QualificationDescription_0"))
				.clear();
		driver.findElement(By.id(
				"cphMainContent_tcEmployeeDetails_tpUpdateQualifications_grdQualificationForAdmin_QualificationDescription_0"))
				.sendKeys("MCA");

		// clear the data corresponding to Year of Qualification and input some value
		driver.findElement(By.id(
				"cphMainContent_tcEmployeeDetails_tpUpdateQualifications_grdQualificationForAdmin_YearOfQualification_0"))
				.clear();
		driver.findElement(By.id(
				"cphMainContent_tcEmployeeDetails_tpUpdateQualifications_grdQualificationForAdmin_YearOfQualification_0"))
				.sendKeys("1993");

		// Click on the update button
		driver.findElement(By.id(
				"cphMainContent_tcEmployeeDetails_tpUpdateQualifications_grdQualificationForAdmin_btnUpdateEdition_0"))
				.click();

		// wait for the succes message to get displayed, fetch the message and print it
		// in the console
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("html/body/form/div[6]/div/div[2]/div[2]/div/div/div[2]/div[3]/div[2]/div/span")));
		String statusMessage = driver
				.findElement(By.xpath("html/body/form/div[6]/div/div[2]/div[2]/div/div/div[2]/div[3]/div[2]/div/span"))
				.getText();

		System.out.println("Status Message: " + statusMessage);

		// Logout from the applicaiton
		driver.findElement(By.xpath("html/body/form/div[4]/div/div[2]/div[1]/a")).click();
	}

	@After
	public void tearDown() {
		// Close the browser
	}
}
