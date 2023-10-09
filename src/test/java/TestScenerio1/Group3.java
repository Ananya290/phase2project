package TestScenerio1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Group3 {
	
WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	// by default every test method is enable=true
	
	@Test(priority='1',enabled=false)
	public void GetTitle()   // Called as a Test Method
	{
		String title = driver.getTitle();
		System.out.println(title);
		
		

}
}
