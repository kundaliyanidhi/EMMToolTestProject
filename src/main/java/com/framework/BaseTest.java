package com.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
	
public WebDriver driver;
	
	@BeforeClass
	@Parameters("browser")
	//Define driver properties before beginning the tests.
	public void setUp(String browser) {
		driver = new LaunchBrowser().Browser(browser);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	//Define driver quit method upon completion of tests.
	public void tearDown() {
		driver.quit();
	}

}
