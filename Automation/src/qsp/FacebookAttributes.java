package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAttributes {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		String text = driver.findElement(By.id("loginbutton")).getText();
		String tag = driver.findElement(By.id("loginbutton")).getTagName();
		String attribute = driver.findElement(By.id("loginbutton")).getAttribute("type");
		System.out.println(text);
		System.out.println(tag);
		System.out.println(attribute);
		
	}

}
