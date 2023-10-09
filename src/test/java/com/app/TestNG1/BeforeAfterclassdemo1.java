package com.app.TestNG1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterclassdemo1 {

	
	@BeforeClass
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
    @AfterClass
	public void logout() {
		System.out.println("logout to gmail");
	}
}
