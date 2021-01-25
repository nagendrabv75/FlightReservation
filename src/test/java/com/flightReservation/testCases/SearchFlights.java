package com.flightReservation.testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchFlights extends BaseClass{

	@Test(priority=1)
	//Method to click the flight option
	public static void clickFlightbutton()
	{
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[3]/a[1]/button[1]/i[1]")).click();
		Assert.assertTrue(true);
	}
	
	@Test(priority=2)
	//Method to select the Trip type
	public static void selectTripType() throws InterruptedException
	
	{
		selectTripList();
		
		List <WebElement> TicketTypeList = driver.findElements(By.tagName("ul"));
		Thread.sleep(5000);
		
		TicketTypeList.get(0).findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]")).click();
		Assert.assertTrue(true);

	}
	
	@Test(priority=3)
	//Method to select the number of Adult passenger/s
	public static void selectAdultPassengers()
	{
		passengerTypeList();
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]"));
		driver.findElement(By.xpath("//div[@id='c0-1']"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//div[@id='c0-1']"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]"));
		Assert.assertTrue(true);
		
	}
	

	@Test(priority=4)
	//Method to select the number of Child passenger/s

	public static void selectChildPassengers() throws InterruptedException 
	{
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[2]"));
		driver.findElement(By.xpath("//div[@id='c0-2']"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//div[@id='c0-2']"));
		//driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[2]"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]"));
		Assert.assertTrue(true);

	}
	
	@Test(priority=5)
	//Method to select the number of Infant passenger/s

	public static void selectInfantPassener() throws InterruptedException  
	{
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[3]"));
		driver.findElement(By.xpath("//div[@id='c0-3']"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[1]/button[2]")).click();
		clickDone();
		Assert.assertTrue(true);

	}
	
	
	@Test(priority=6)
	//Method to select the Type of class

	public static void selectClassType() throws InterruptedException
	{
		callTabMethod();
		pressDownArrow();
		pressDownArrow();
		callTabMethod();
		Assert.assertTrue(true);

	}
	
	
	/*@Test(priority=7)
	public static void selectFromCity() throws InterruptedException
	{
		//driver.findElement(By.xpath("/body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[6]/div[2]"));
		//driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[6]/div[2]/div[2]"));
		//driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[6]/div[2]/div[2]/div[1]"));
		//WebElement fromCity = driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[6]/div[2]/div[2]/div[1]/div[1]/input[1]"));
		
		
		
		WebElement fromCity=driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		//fromCity.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE), "SYD");
		
		
		fromCity.clear();
		Thread.sleep(3000);
		String  City="Sy";
		
		char[] charsCity = City.toCharArray();
		
		for(int i=0 ;i <charsCity.length;i++)
		{
			fromCity.sendKeys(String.valueOf(charsCity[i]).toString());
			Thread.sleep(2000);
		}
		
		for(int i=0;i<City.length();i++)
		{
			fromCity.sendKeys(Character.toString(City.charAt(i)));
		//	waitUntil(attributeContains(fromCity,"value",City.substring(0,i)));
			
			
		}
		
		Thread.sleep(3000);
		callTabMethod();
	}*/
	
	@Test(priority=8)
	//Method to Enter/Select the Destination Country/City

	public static void selectToCity() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]"));
		WebElement Dest = driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		Dest.clear();
		Dest.sendKeys(Destination);
		callTabMethod();
		Assert.assertTrue(true);

	}
	
	@Test(priority=9)
	//Method to select the Departure date

	public static void selectDepDate() throws InterruptedException
	{
		WebElement DepDate= driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		DepDate.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE),"" );
		DepDate.sendKeys(DepDt);
		callTabMethod();
		Assert.assertTrue(true);

	}
	
	@Test(priority=10)
	//Method to select the Arrival date

	public static void selectRetDate() throws InterruptedException
	{
		WebElement RetDate=driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]"));
		RetDate.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "");
		RetDate.sendKeys(RetDt);
		
		callTabMethod();
		Assert.assertTrue(true);

	}

	//Trip Method
	private static void selectTripList() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
	}
	
	//Tab Method
	private static void callTabMethod() throws InterruptedException
	{
		Actions pressTab = new Actions(driver);
		pressTab.sendKeys(Keys.TAB).perform();

		Thread.sleep(3000);
	}

	//DownArrow Key method
	private static void pressDownArrow() throws InterruptedException
	{
		Actions pressDA = new Actions(driver);
		pressDA.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
	}
	
	//Passenger dialog box method
	private static void  passengerTypeList() 
	{
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/div[2]")).click();
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]"));
		
	}
	
	//Done Method
	private static void clickDone()
	{
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/button[1]/span[1]")).click();
		
	}
}


