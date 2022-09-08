package com.actitime.testscript;

import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.actitime.generic.ListenersImplementation.class)
public class CustModule extends BaseClassForActitime {
	@Test
	public void createCustomer() throws InterruptedException
	{
		//Thread.sleep(3000);
		Reporter.log("create customer",true);
		Thread.sleep(5000);
		Assert.fail();
	}

}
