package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo2_WindowsHandling {
  @Test
  public void windowshandling() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();  
	     driver.get("http://demo.guru99.com/popup.php");
	     driver.manage().window().maximize();
	     driver.findElement(By.linkText("Click Here")).click();
	     Set<String> windows=driver.getWindowHandles();
	     Iterator<String> it=windows.iterator();
	     String parentwindow=it.next();
	     String childwindow=it.next();
	     driver.switchTo().window(childwindow);
	     driver.findElement(By.name("emailid")).sendKeys("aravindmca@gmail.com");
	     driver.findElement(By.name("btnLogin")).click();
	     System.out.println("title of the child window is"+driver.getTitle());
	     driver.close();
	     driver.switchTo().window(parentwindow);
	     System.out.println("parent window title is "+driver.getTitle()); 
  }
}
