package com.app.TestNG1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertdemo2 {
	@Test
	public void method1() {
		String expectedresult = "selenium";
		String actualresult = "seleniumtest";
		
		Assert.assertNotEquals(expectedresult, actualresult);
	}
	@Test
	public void method2() {
		String actualresult = "ananya";
		
		Assert.assertNotNull( actualresult);
	}
	@Test
	public void method3() {
		String actualresult = null;
		
		Assert.assertNull( actualresult);
	}


}
