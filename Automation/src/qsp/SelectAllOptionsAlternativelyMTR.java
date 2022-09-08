package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOptionsAlternativelyMTR {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/OneDrive/Desktop/Selenium%20Example%20Html/hotel.html");
		WebElement mlb = driver.findElement(By.id("mtr"));
		Select s=new Select(mlb);
		List<WebElement> all = s.getOptions();
		int count = all.size();
		for(int i=0;i<count;i++)
		{
			if(i%2==0)     // or not use if use i=i+1
			{
				Thread.sleep(500);
				s.selectByIndex(i);
				//   i=i+1
			}
			
		}
	}

}
