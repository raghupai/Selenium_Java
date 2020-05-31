package com.test;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Demo11_ExcelWriting {
	WebDriver driver;
	String url = "http://localhost:8080/PackAndGo_v2/index.html";

	@Before
	public void setUp() {
		// Set the key/value property according to the browser you are using.
		// Open browser instance
		// Open the AUT
		// Declare an implicit wait which is bounded to WebDriver instance
	}

	@Test
	public void test() throws InterruptedException, IOException {
		String filePath = System.getProperty("user.dir") + "\\Cred.xlsx";

		// FileInputStream
		// Access the workbook
		// Access the sheet
		// for (int i = 1; i <= rowCount; i++) {
		// Login and fetch the welcome message

		// Get the current row where the data has to be written
		// Row newRow = getSheet.getRow(i);

		// Create a new cell with reference to the row
		// Cell cell = newRow.createCell(2);

		// Set the value in the cell
		// cell.setCellValue(DashboardMessage);

		// Logout from the application.
	}

	// Create an output stream with the location where the file has to be created
	// FileOutputStream fileOutputStream = new FileOutputStream(filePath);

	// Write the workbook
	// workbook.write(fileOutputStream);

	// Close the workbook
	// workbook.close();
	// }

	@After
	public void tearDown() {
		// Close the browser.
	}
}
