package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PageTest_Class {
  @Test
  public void demowebshop() throws InterruptedException {
	  WebDriver driver=DriverUtility.getDriver("chrome");
	  driver.get("http://demowebshop.tricentis.com");
	  Pageclass pobject=new Pageclass(driver);
	  driver.manage().window().maximize();
	  pobject.clicklink();
	  pobject.typeusername();
	  pobject.typepassword();
	  pobject.clickonlogin();
	  pobject.typesearch();
	  pobject.clickonsubscribe();
	  Thread.sleep(2000);
	  pobject.clickonlogout();
	  System.out.println("title of the page is "+driver.getTitle());
	  driver.close();
	  
  }
}
