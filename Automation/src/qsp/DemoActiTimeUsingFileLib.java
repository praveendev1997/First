package qsp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoActiTimeUsingFileLib {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pwd = f.getPropertyData("password");
		//System.out.println(url+""+un+""+pwd);
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
