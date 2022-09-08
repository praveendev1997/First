package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 *this is generic class for webdriver element
 * @author User
 *
 */
public class WebDriverCommonLib {
	/**
	 * this method is to select options from listBox using index
	 * @param element
	 * @param i
	 */
	public void selectOption(WebElement element,int i)
	{
		Select s=new Select(element);
		s.selectByIndex(i);
	}
	/**
	 * this method is to select options from listBox using visible text
	 * @param element
	 * @param text
	 */
	public void selectOption(WebElement element,String text)
	{
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	/**
	 * this is implicit wait for page load
	 * @param driver
	 */
	public void waitForPageload(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	/**
	 * this is generic method for explicit wait
	 * @param driver
	 * @param element
	 */
	public void waitForElementPresent(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * this is generic method for custom wait
	 * @param element
	 */
	public void customWaitForElement(WebElement element)
	{
		int i=0;
		while(i<100)
		{
			try
			{
				element.isDisplayed();
				break;
			}
			catch(Exception e)
			{
				i++;
			}
		
		}
	}
}

