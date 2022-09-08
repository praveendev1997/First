package com.actitime.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingValidAndInvalidActitime {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		LoginActitime la=new LoginActitime(driver);
		la.setLogin("admin1","manager1");
		Thread.sleep(8000);
		la.setLogin("admin", "manager");
		driver.close();
	}

}
