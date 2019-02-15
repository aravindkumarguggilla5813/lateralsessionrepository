package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demo1 {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver(); 
		 driver.get("https://www.hdfcbank.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 Actions act1=new Actions(driver);
		 act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products']"))).perform();
		 act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat']"))).perform();
		 act1.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat/demat-account']"))).click().perform();
		 Thread.sleep(5000);
		 System.out.println("Title of the page is "+driver.getTitle());
		 System.out.println("url of the page is"+driver.getCurrentUrl());
		 Assert.assertTrue(driver.getTitle().startsWith("Demat Account"));
	  
  }
}
