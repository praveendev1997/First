package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTabAddress {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allW = driver.getWindowHandles();
		int count = allW.size();
		for(String w:allW)
		{
			driver.switchTo().window(w);
			String title = driver.getTitle();
			System.out.println("address ="+w);
			System.out.println("title ="+title);
		}
		driver.quit();
	}

}
