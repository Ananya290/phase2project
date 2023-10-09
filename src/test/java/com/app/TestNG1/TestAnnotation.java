package com.app.TestNG1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TestAnnotation {

	@Test
	public void GetTite() 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
	@Test
	public void login() throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();

		driver.findElement(By.id("input-email")).sendKeys("ananyashukla@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(1500);
		driver.close();
		

	}
	

	@Test
	public void logout() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumdemo@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(1500);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		Thread.sleep(1500);
		driver.close();
	}
	
}
