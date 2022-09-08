package com.actitime.generic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public WebDriver driver;
	@org.testng.annotations.Parameters("browser")
	@BeforeTest
	public void openBrowser(String browser)
	{
		Reporter.log("open browser",true);
		driver=new ChromeDriver();
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the browser");
		String browser=sc.next();*/
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
	}
	@AfterTest
	public void closeBrowser()
	{
		Reporter.log("close browser",true);
		driver.close();
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}

}
