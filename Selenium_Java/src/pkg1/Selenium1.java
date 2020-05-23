package pkg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "/Users/raghuveer/Desktop/SeleniumDrivers/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.close();
		
	}

}
