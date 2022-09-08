package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintCurrentUrl {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String url=driver.getCurrentUrl();
		if(url.equals("https://www.selenium.dev/"))
		{
			System.out.println("url is successfully navigating pass");
		}
		else
		{
			System.out.println("not navigating");
		}
		driver.close();

	}

}
