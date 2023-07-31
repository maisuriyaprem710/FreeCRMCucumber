package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath ="//div[@class='ui fluid large blue submit button']")
	WebElement loginbutton;
	
	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	public String validateLoginPageTitle() {
		
		return driver.getTitle();
	}
	
	public HomePage Login(String un, String pwd) throws IOException {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
