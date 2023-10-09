package com.app.TestNg.ExtendReport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SetUpCheck {
	
	@Test
	public void extenddemo()
	{
		ExtentReports ex = new ExtentReports();
		
		ExtentSparkReporter sparkreporter= new ExtentSparkReporter("C:\\Users\\anany\\eclipse-workspace\\tESTNG1\\extentreport\\report.html");
		
		
		
		ex.attachReporter(sparkreporter);
		ex.flush();
		
		
		
	}

}
