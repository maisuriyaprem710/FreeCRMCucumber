package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gmail.qa.util.TestUtil;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	
public BaseClass() throws IOException {
		
		
		FileInputStream fi = new FileInputStream("C:\\QA\\SeleniumWorkSpace\\APageObjectmodelwithBDD\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop = new Properties();
		prop.load(fi);
	}

public static void initialization() throws IOException {
	
	
	
	String BrowserName = prop.getProperty("browser");
	
	if(BrowserName.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe\\");
		 driver = new FirefoxDriver();
			
	}
	else if (BrowserName.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe\\");
		 driver = new ChromeDriver();
		
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.implicite_wait,TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
	

}





}
