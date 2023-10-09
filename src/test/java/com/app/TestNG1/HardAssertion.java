package com.app.TestNG1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


//import dev.failsafe.internal.util.Assert;

public class HardAssertion {
	
	
	
WebDriver driver;

@BeforeClass
public void openBrowser()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
}

@Test(priority='1')
public void GetTitle()   // Called as a Test Method
{
	
	String expectedtitle = "Your Store";
	String actualtitle = driver.getTitle();
	
	
	
   Assert.assertEquals(actualtitle, expectedtitle, "The title donot match");
   
   // assertTrue();
   
boolean searchbox =  driver.findElement(By.name("search")).isDisplayed();

searchbox = false;

//Assert.assertTrue(searchbox);
   
driver.findElement(By.name("search")).sendKeys("mac");

driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	
}
	


}
