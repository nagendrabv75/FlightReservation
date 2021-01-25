package com.flightReservation.testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchFlights2 extends BaseClass{

	@Test(priority=1)
	public static void clickFlightbutton()
	{
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[3]/a[1]/button[1]/i[1]")).click();
		Assert.assertTrue(true);
	}
	
	@Test(priority=2)
	public static void selectTripType() throws InterruptedException
	
	{
		selectTripList();
		
		List <WebElement> TicketTypeList = driver.findElements(By.tagName("ul"));
		Thread.sleep(5000);
		
		TicketTypeList.get(0).findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]")).click();
	}
	
	@Test(priority=3)
	public static void selectAdultPassengers()
	{
		passengerTypeList();
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]"));
		driver.findElement(By.xpath("//div[@id='c0-1']"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//div[@id='c0-1']"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]"));
			
	}
	

	@Test(priority=4)
	public static void selectChildPassengers() throws InterruptedException 
	{
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[2]"));
		driver.findElement(By.xpath("//div[@id='c0-2']"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//div[@id='c0-2']"));
		//driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[2]"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]"));
	}
	
	@Test(priority=5)
	public static void selectInfantPassener() throws InterruptedException  
	{
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[3]"));
		driver.findElement(By.xpath("//div[@id='c0-3']"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[1]/button[2]")).click();
		clickDone();
		
	}
	
	
	@Test(priority=6)
	public static void selectClassType() throws InterruptedException
	{
		callTabMethod();
		pressDownArrow();
		pressDownArrow();
		callTabMethod();
	}
	
	
	//@Test(priority=7)
/*	public static void selectFromCity() throws InterruptedException
	{
		//driver.findElement(By.xpath("/body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[6]/div[2]"));
		//driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[6]/div[2]/div[2]"));
		//driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[6]/div[2]/div[2]/div[1]"));
		//WebElement fromCity = driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[6]/div[2]/div[2]/div[1]/div[1]/input[1]"));
		
		
		
		WebElement fromCity=driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		fromCity.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE), "Sy");
		Thread.sleep(3000);
		callTabMethod();
	}*/
	
	@Test(priority=8)
	public static void selectToCity() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]"));
		WebElement Dest = driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		Dest.clear();
		//Dest.sendKeys("");
		//Dest.sendKeys(Keys.BACK_SPACE);
		Dest.sendKeys(Destination);
		callTabMethod();
	}
	
	@Test(priority=9)
	public static void selectDepDate() throws InterruptedException
	{
		WebElement DepDate= driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		DepDate.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE),"" );
		DepDate.sendKeys(DepDt);
		callTabMethod();
	}
	
	@Test(priority=10)
	public static void selectRetDate() throws InterruptedException
	{
		WebElement RetDate=driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]"));
		RetDate.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE), "");
		RetDate.sendKeys(RetDt);
		
		callTabMethod();
	}


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
	
	
	private static void callTabMethod() throws InterruptedException
	{
		Actions pressTab = new Actions(driver);
		pressTab.sendKeys(Keys.TAB).perform();

		Thread.sleep(3000);
	}

	private static void pressDownArrow() throws InterruptedException
	{
		Actions pressDA = new Actions(driver);
		pressDA.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
	}
	private static void  passengerTypeList() 
	{
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]/div[2]")).click();
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]"));
		
	}
	
	private static void clickDone()
	{
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]"));
		driver.findElement(By.xpath("//body/c-wiz[2]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/c-wiz[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/button[1]/span[1]")).click();
		
	}
}


