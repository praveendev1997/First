package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginEnabledInFacebook {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		boolean login = driver.findElement(By.name("login")).isEnabled();
		if(login==true)
		{
			System.out.println("Login is Enabled in Facebook");
		}
		else
		{
			System.out.println("Login is not enabled in Facebook");
		}
		driver.close();
	}

}
