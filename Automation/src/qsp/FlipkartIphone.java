package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphone {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException{
	WebDriver  driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div/div/button")).click();
	driver.findElement(By.name("q")).sendKeys("iphone 13 pro max"+Keys.ENTER);
	List<WebElement> pl = driver.findElements(By.xpath("(//div[contains(text(),'iPhone 13 Pro Max')])/../../div[2]/div[1]/div[1]/div"));
	List<WebElement> m = driver.findElements(By.xpath("//div[contains(text(),'iPhone 13 Pro Max')]"));
	int count = pl.size();
	System.out.println("total product found "+count);
	for(int i=0;i<count;i++)
	{
		System.out.println((i+1+"> "+m.get(i).getText())+" price is --->"+pl.get(i).getText());
	}
	driver.close();
	}

}
