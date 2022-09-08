package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEx {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		driver.manage().window().maximize();
		WebElement res = driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions(driver);
		Thread.sleep(1000);
		a.moveToElement(res).perform();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		String contact = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]/../p[2]")).getText();
		System.out.println("contact no is :"+contact);
		driver.close();
	}

}
