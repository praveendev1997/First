package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightAndWidthEqualOrNot {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement un = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.name("pwd"));
		int h_un = un.getSize().getHeight();
		int w_un =un.getSize().getWidth();
		int h_pwd = pwd.getSize().getHeight();
		int w_pwd =pwd.getSize().getWidth();
		
		if(h_un==h_pwd && w_un==w_pwd)
		{
			System.out.println("username and password are alligned proprly");
		}
		else
		{
			System.out.println("Username and password not alligned properly");
		}
		driver.close();
	}

}
