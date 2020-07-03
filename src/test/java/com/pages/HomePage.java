package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import io.qameta.allure.Step;

public class HomePage {
	
	public WebDriver driver;
	
	By sideButton_button = By.xpath("//button[@id='sidebarToggle']");
	By auditSurvey_button = By.xpath("//a[contains(text(),'Audit Survey')]");
	By selectAccount_button = By.xpath("//button[contains(text(),'Please select account')]");
	By selectKPMG_button = By.xpath("//a[contains(text(),'KPMG')]");
	By tier1Services = By.xpath("//a[contains(text(),'tier-1 services')]");
	
			
	//Instantiate the WebDriver by creating a constructor.
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickSideButton() {
		driver.findElement(sideButton_button).click();
		System.out.println("Side button clicked");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void selectAuditSurvey() {
		driver.findElement(auditSurvey_button).click();
		System.out.println("Audit Survey clicked");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void selectAccount() {
		driver.findElement(selectAccount_button).click();
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(selectKPMG_button)).click().build().perform();
		actions.moveToElement(driver.findElement(tier1Services)).click().build().perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Account selected");
	}
	
	
	//Define method to select the Account.
	@Step("Account Selection")
	public void submitTheForm() {
		clickSideButton();
		selectAuditSurvey();
		selectAccount();
	}
	


}
