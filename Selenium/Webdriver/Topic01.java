package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Topic01 {
	WebDriver driver;
	
	@Test
	public void on_FireFox() {
		driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.quit();
	}

	@Test
	public void on_Chrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Be Mai\\Desktop\\Auto\\WorkSpace\\Selenium_Web_Driver\\BrowserDrivers\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("headless");
		//options.addArguments("window-size=1366x768");
		//driver = new ChromeDriver(options);
		driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.quit();
	}

	
	

}


