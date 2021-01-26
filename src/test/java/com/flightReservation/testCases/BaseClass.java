package com.flightReservation.testCases;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.flightReservation.utilities.ReadConfig;


public class BaseClass {
	
	ReadConfig readcfg=new ReadConfig();
	
	public String baseURL=readcfg.getApplicationURL();
	
	public static String Destination="L";
	public static String DepDt = "Thu, Jul 1";
	public static String RetDt = "Sun, Aug 1";
	public static WebDriver driver;
	public static Logger logger;
	
	
	
	@BeforeClass 
	void setup()
	{
		logger=Logger.getLogger("FlightReservation");
		PropertyConfigurator.configure("Log4j.properties");
		
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
