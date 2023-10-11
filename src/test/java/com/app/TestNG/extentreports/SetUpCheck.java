package com.app.TestNG.extentreports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SetUpCheck {
	
	public void extentdemo()
	{
		
		ExtentReports ex = new ExtentReports();
		
		
		
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter("C:\\Users\\HP\\eclipse-workspace\\2022\\TestNGphase2\\extentReport\\report.html");
		
		
		ex.attachReporter(sparkreporter);
		ex.flush(); 
	}
	
@Test
	public void extentDemo2() throws IOException
	{
	ExtentReports ex=new ExtentReports();
	File file = new File("report1.html");
	ExtentSparkReporter sparkreporter = new ExtentSparkReporter(file);
	ex.attachReporter(sparkreporter);
	ex.flush();
	Desktop.getDesktop().browse(new File("report1.html").toURI());

}
}
