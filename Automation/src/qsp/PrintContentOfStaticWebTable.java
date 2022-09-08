package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintContentOfStaticWebTable {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:5500/StaticWeb.html");
		List<WebElement> link = driver.findElements(By.xpath("//td"));
		int count = link.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = link.get(i).getText();
			System.out.println(text);
		}
		driver.close();

	}

}
