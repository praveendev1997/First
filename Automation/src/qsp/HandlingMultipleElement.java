package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElement {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/OneDrive/Desktop/QJ.html");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		String l1 = link.get(0).getText();
		System.out.println("1st link is "+l1);
		String l2 = link.get(1).getText();
		System.out.println("2nd link is "+l2);
		link.get(0).click();
		Thread.sleep(2000);
		driver.navigate().back();
		link.get(1).click();
		Thread.sleep(2000);
		driver.close();
	}

}
