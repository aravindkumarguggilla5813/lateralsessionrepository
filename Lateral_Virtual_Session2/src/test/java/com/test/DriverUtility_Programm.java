package com.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class DriverUtility_Programm {
	@Test
	
	public void testmeapp()
	{
		WebDriver driver =DriverUtility.getDriver("firefox");
		 String url ="http://localhost:8083/TestMeApp2.2/";
			driver.navigate().to(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("the page title is"+driver.getTitle());
			driver.findElement(By.linkText("SignIn")).click();
			driver.findElement(By.id("userName")).sendKeys("Lalitha");
			driver.findElement(By.id("password")).sendKeys("password123");
			driver.findElement(By.name("Login")).click();
		
		
	}
	

}
