package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pageclass {

WebDriver driver;

By lnk=By.linkText("Log in");
By uname=By.name("Email");
By pwd=By.id("Password");
By login=By.xpath("//input[@value='Log in']");
By search =By.id("newsletter-email");
By subs=By.id("newsletter-subscribe-button");
By lout=By.linkText("Log out");	


public Pageclass(WebDriver driver) {
	this.driver=driver;
	
}

public void clicklink() {
	driver.findElement(lnk).click();
}


public void typeusername() {
	driver.findElement(uname).sendKeys("aravind.guggilla57@gmail.com");
}
public void typepassword() {
	driver.findElement(pwd).sendKeys("aravind");
}

public void clickonlogin() {
	driver.findElement(login).click();
	
}

public void typesearch() {
	driver.findElement(search).sendKeys("mobiles");
}

public void clickonsubscribe() {
	driver.findElement(subs).click();
}

public void clickonlogout() {
	driver.findElement(lout).click();
	
}



}
