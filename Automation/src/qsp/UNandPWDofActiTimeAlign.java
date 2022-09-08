package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UNandPWDofActiTimeAlign {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int un = driver.findElement(By.id("username")).getLocation().getX();
		int pwd = driver.findElement(By.name("pwd")).getLocation().getX();
		if(un==pwd)
		{
			System.out.println("UN and Pwd are alligned properly");
		}
		else
		{
			System.out.println("UN and PWD are not alligned properly");
		}
		driver.close();
	}

}
