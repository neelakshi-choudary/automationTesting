package com.tng.demotest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1
{
  ChromeDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void setup()
	
	//Code to launch browser
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neelakshi\\Paths\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://computer-database.gatling.io/computers/");
	}
	@AfterTest
	
	//Code to close the browser
	public void CleanUp()
	{
		driver.close();
	}
	
    @Test
    public void testdelete()
   {
    	//Clicks on any data from the records
    	//We can also read the data from an excel or a CSV file
			driver.findElement(By.xpath(".//a[text()='Amiga 1']")).click();
			driver.findElement(By.xpath(".//input[@value='Delete this computer']")).click();
   }		
	@Test(priority=1)
	
	 public void testcreate()
	 {
		driver.findElement(By.xpath("//input[@id='add']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("XYZ");
		Select objselect = new Select(driver.findElement(By.id("company")));
		objselect.selectByIndex('1');
		driver.findElement(By.xpath(".//input[@value='Create this computer']")).click();
	 }
  }
