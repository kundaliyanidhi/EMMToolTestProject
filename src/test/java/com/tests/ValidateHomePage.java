package com.tests;

import org.testng.annotations.Test;

import com.framework.BaseTest;
import com.pages.HomePage;
import com.utils.PropReader;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class ValidateHomePage extends BaseTest {
	
	//Login test.
	@Test(priority=1, description="Submit the survey form")
	@Severity(SeverityLevel.BLOCKER)
	public void validateLogin() {
		PropReader pr = new PropReader("src/test/resources/config.properties");
		String url = pr.getValue("url");
		
		driver.get(url);
		System.out.println("application launched");
		
		HomePage hPage = new HomePage(driver);
		hPage.submitTheForm();
		
		
	}

}
