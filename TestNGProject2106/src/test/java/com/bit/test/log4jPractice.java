package com.bit.test;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;


public class log4jPractice {
	
	@Test
	public void test1() { //gives reference by getting logger method and tskes class as parameter
	Logger log=	Logger.getLogger(log4jPractice.class);
	DOMConfigurator.configure("config.xml");
	log.fatal("this is fatal");
	log.error("This is error");
	log.warn("This is warn");
	log.info("this is info");
	log.debug("this is debug");
	log.trace("this is trace");
	
	ChromeOptions comOp=new ChromeOptions();
	
	DesiredCapabilities cap = DesiredCapabilities.chrome(); 
	cap.setBrowserName("chrome");
	cap .setPlatform(Platform.MAC);
	
	//copy and paste 
	//based on configuration file, to read I need Dom COnfigurator class
	
	
	
	
	WebDriver dr=new RemoteWebDriver(new URL( “http://192.168.86.165:4444/wd/hub”),comOP);

	
	}
	}
