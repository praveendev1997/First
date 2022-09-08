package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectCheckP {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/OneDrive/Desktop/Selenium%20Example%20Html/hotel.html");
		WebElement CheckPost = driver.findElement(By.id("cp"));
		Select s=new Select(CheckPost);
		List<WebElement> allOp = s.getOptions();
		for(WebElement i:allOp)
		{
			String text = i.getText();
			System.out.println(text);
		}
		driver.close();
	}

}
