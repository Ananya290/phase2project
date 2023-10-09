package com.app.TestNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAftermethod2 {
	WebDriver driver;

	
    @BeforeMethod
	public void Browser() 
	{
		
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		}

	@Test (priority = '1')
	public void GetTite() 
	{
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	@Test
	public void login() throws InterruptedException 
	{
		
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();

		driver.findElement(By.id("input-email")).sendKeys("ananyashukla@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(1500);
		
		

	}
	

	@Test
	public void logout() throws InterruptedException
	{
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumdemo@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(1500);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		Thread.sleep(1500);
		
	}
	@AfterMethod
	public void close() {
		driver.close();
		
	}
}
