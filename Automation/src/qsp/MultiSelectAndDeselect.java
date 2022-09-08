package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectAndDeselect {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/OneDrive/Desktop/Selenium%20Example%20Html/hotel.html");
		WebElement mtrlb = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlb);
		Thread.sleep(2000);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("v");
		Thread.sleep(2000);
		s.selectByVisibleText("bread omlette");
		System.out.println(s.isMultiple());
		s.deselectAll();
	}

}
