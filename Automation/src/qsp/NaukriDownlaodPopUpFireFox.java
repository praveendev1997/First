package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaukriDownlaodPopUpFireFox {
	static
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[.='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("devadigapraveen6@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("*******");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Praveen Devadiga']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='right download']")).click();
		driver.quit();
	}

}
