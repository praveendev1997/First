package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement month = driver.findElement(By.id("day"));
		Select m=new Select(month);
		WebElement day = driver.findElement(By.id("month"));
		Select d=new Select(month);
		WebElement year = driver.findElement(By.id("year"));
		Select y=new Select(year);
		d.selectByIndex(1);
		Thread.sleep(2000);
		m.selectByValue("7");
		Thread.sleep(2000);
		y.selectByVisibleText("1997");
		Thread.sleep(2000);
		driver.close();
		

	}

}
