package com.app.TestNg.ExtendReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extenteportdemo2 {
	
	@Test
	public void extentdemo2() throws IOException {
		
		ExtentReports ex = new ExtentReports();
		File file = new File("report1.html");
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter(file);
		ex.attachReporter(sparkreporter);
		
		
		ExtentTest test1 = ex.createTest("test1");	
		test1.pass("testpass");
		ExtentTest test2 = ex.createTest("test1");
		test2.log(Status.FAIL, "fail ho gya");
		
		ExtentTest test3 = ex.createTest("test1");	
		test3.pass("testpass");
		
		ExtentTest test4 = ex.createTest("test1");	
		test3.skip("skip");

		
		ex.flush(); 
		Desktop.getDesktop().browse(new File("report1.html").toURI());
		

}
}
