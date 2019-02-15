package com.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Selenium_grid {
  @Test
  public void f() throws MalformedURLException {
  DesiredCapabilities cap=new DesiredCapabilities();
  cap.setBrowserName("chrome");
  cap.setPlatform(Platform.ANY);
  ChromeOptions cop= new ChromeOptions();
  cop.merge(cap);
  String huburl="http://10.204.88.78:4444/wd/hub";
  WebDriver driver=new RemoteWebDriver( new URL(huburl),cap);
  driver.get("http://www.google.com");
  System.out.println("title"+driver.getTitle());	  
	  
  }
}
