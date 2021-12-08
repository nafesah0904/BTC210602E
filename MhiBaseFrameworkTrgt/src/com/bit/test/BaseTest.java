package com.bit.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	WebDriver driver;
	//Open blank browser
	@Before
	public void openBrowser() {
	           //  C:\Users\nafes_zaessqh\OneDrive\Desktop\QA Important  ==> Must insert.exe to property variables
			   //and double slash for windows
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nafes_zaessqh\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		
		driver = new ChromeDriver();
		
		
	
	}
	///add check up GIT
	
	@After
	public void closeBrowser() {
		driver.close();
	}
	

}
