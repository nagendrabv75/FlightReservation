package com.flightReservation.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {
	
	public String baseURL="https://www.google.com/travel/";
	public static String Destination="L";
	public static String DepDt = "Thu, Jul 1";
	public static String RetDt = "Sun, Aug 1";
	public static WebDriver driver;
	
	
	
	@BeforeClass 
	void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver");
        driver=new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		driver.get(baseURL);
		driver.manage().window().maximize();
		
	}
	
	/*
	@AfterClass
	public void close()
	{
		driver.close();
	}
	*/

}
