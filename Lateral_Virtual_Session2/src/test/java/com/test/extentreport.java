package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentreport {
  @Test
  public void logintest() {
	  WebDriver driver=DriverUtility.getDriver("chrome");
	  driver.get("http://demowebshop.tricentis.com");
	  Pageclass pobject=new Pageclass(driver);
	  driver.manage().window().maximize();
	  pobject.clicklink();
	  pobject.typeusername();
	  pobject.typepassword();
	  pobject.clickonlogin();
	  System.out.println("title of the page is "+driver.getTitle());
	  ExtentHtmlReporter Reporter= new ExtentHtmlReporter("C:\\Users\\aravind.g.kumar\\Desktop\\newextentreport.html");
	  ExtentReports extent= new ExtentReports();
	  extent.attachReporter(Reporter);
      ExtentTest logger=extent.createTest("logintest");
      logger.log(Status.INFO ,"Login into application");
      logger.log(Status.PASS, "Title is verified");
       extent.flush();
        
       ExtentTest logger2=extent.createTest("logintest2");
       logger2.log(Status.INFO, "homepage");
       logger2.log(Status.FAIL, "Home page loading is fail");
       logger2.log(Status.FAIL, "There is some 404 error");
       extent.flush();
       
       }
      
      
      
      
	  
	  
  }

private void logintest2() {
	// TODO Auto-generated method stub
	
}
}
