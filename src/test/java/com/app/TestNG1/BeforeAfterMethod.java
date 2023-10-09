package com.app.TestNG1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
	@BeforeMethod
	public void login() {
		System.out.println("login to gmail");
	}
	@Test
	public void composeEmail() {
		System.out.println("compose to gmail");
	}

	@Test
	public void delete() {
		System.out.println("delete contant of  gmail");
	}
    @AfterMethod
	public void logout() {
		System.out.println("logout to gmail");
	}
	
	


}
