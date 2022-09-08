package qsp;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingTabUsingIterator {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		String pW = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(2000);
		Set<String> all = driver.getWindowHandles();
		Iterator<String> i=all.iterator();
		while(i.hasNext())
		{
			String nw = i.next();
			driver.switchTo().window(nw);
			if(!(pW.equals(nw)))
			{
				driver.close();
			}
			driver.switchTo().window(pW);
		}
		driver.close();
		//driver.quit();
	}

}
