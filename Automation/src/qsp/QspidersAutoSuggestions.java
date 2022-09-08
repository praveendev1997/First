package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspidersAutoSuggestions {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Qspiders");
		Thread.sleep(3000);
		List<WebElement> sugg = driver.findElements(By.xpath("//span[contains(text(),'Spiders') or contains(text(),'spiders')]"));
		int count = sugg.size();
		System.out.println(count);
		for(WebElement e:sugg)
		{
			System.out.println(e.getText());
		}
		
		sugg.get(count-1).click();
		driver.close();
		
	}

}
