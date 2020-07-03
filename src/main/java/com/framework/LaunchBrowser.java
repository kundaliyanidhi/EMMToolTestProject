package com.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LaunchBrowser {
	
	public WebDriver driver;
	
	/*
	 * Define driver/browser properties.
	 * The class can be modified to accomodate more browsers in future.
	 */
	
	public WebDriver Browser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
			driver = new FirefoxDriver();
		}else {
			Assert.assertFalse(false, "Invalid Browser");
		}
		return driver;
	}

}
