package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeightAndWidth {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		 WebElement emailTbx = driver.findElement(By.id("email"));
		 int height = emailTbx.getSize().getHeight();
		 int width=emailTbx.getSize().getWidth();
		 System.out.println("height="+height);
		 System.out.println("width="+width);
		 driver.close();
	}

}
