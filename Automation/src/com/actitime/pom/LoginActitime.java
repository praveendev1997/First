package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginActitime {
	private WebElement untbx;
	private WebElement pwd;
	private WebElement lbn;
	public LoginActitime(WebDriver driver)
	{
		untbx=driver.findElement(By.id("username"));
		pwd=driver.findElement(By.name("pwd"));
		lbn=driver.findElement(By.xpath("//div[.='Login ']"));
	}
	public void setLogin(String un,String pswd)
	{
		untbx.sendKeys(un);
		pwd.sendKeys(pswd);
		lbn.click();
	}

}
