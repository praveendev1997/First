package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlternativeFrameSwitch {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/OneDrive/Desktop/Selenium%20Example%20Html/page1.html");
		Thread.sleep(1000);
		driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		driver.findElement(By.id("t1")).sendKeys("c");
		WebElement frm = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frm);
		Thread.sleep(1000);
		driver.findElement(By.id("t2")).sendKeys("d");
		driver.close();
	}

}
