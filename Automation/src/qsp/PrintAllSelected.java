package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSelected {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/OneDrive/Desktop/Selenium%20Example%20Html/hotel.html");
		WebElement allo = driver.findElement(By.id("cp"));
		Select s=new Select(allo);
		List<WebElement> al = s.getAllSelectedOptions();
		int count=al.size();
		System.out.println(count);
		for(WebElement a:al)
		{
			System.out.println(a.getText());
		}
	}

}
