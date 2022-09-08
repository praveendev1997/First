package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageOld {
	private WebElement untbx;
	public LoginPageOld(WebDriver driver)
	{
	untbx=driver.findElement(By.id("username"));
	}
	public void setLogin(String un)
	{
		untbx.sendKeys(un);
	}
}
