package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XAndYAxisOfFacebookEmail {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement email = driver.findElement(By.id("email"));
		int x = email.getLocation().getX();
		int y=email.getLocation().getY();
		System.out.println(" x axis of email txtbox of facebook is "+x);
		System.out.println("y axis of email txtbox of facebook is "+y);
		Point a = email.getLocation();
		System.out.println(" point is "+a);
		driver.close();

	}

}
