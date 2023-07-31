package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.BaseClass;

public class HomePage extends BaseClass {
	
	
	@FindBy(linkText = "Calendar")
	WebElement Calendar;
	
	@FindBy(linkText = "Contacts")
	WebElement Contacts;
	
	@FindBy(linkText = "Home")
	WebElement Home;
	
	@FindBy(linkText = "Companies")
	WebElement Companies;
	
	@FindBy(linkText = "Deals")
	WebElement Deals;
	
	@FindBy(linkText = "Tasks")
	WebElement Tasks;
	
	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement username;
	
	
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public void ClickOnContacts() {
		Contacts.click();
	}

	public void ClickOnCompanies() {
		Companies.click();
	}
	
	public void ClickOnCalendar() {
		Calendar.click();
	}
	
	public void ClickOnDeals() {
		Deals.click();
	}
	
	public void ClickOnTasks() {
		Tasks.click();
	}
	
	public boolean correctusername() {
		return username.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
