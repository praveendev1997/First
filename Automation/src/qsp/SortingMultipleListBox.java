package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortingMultipleListBox {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/OneDrive/Desktop/Selenium%20Example%20Html/hotel.html");
		WebElement mlb = driver.findElement(By.id("mtr"));
		Select s=new Select(mlb);
		TreeSet< String> ts=new TreeSet<>();
		List<WebElement> count = s.getOptions();
		for(int i=0;i<count.size();i++)
		{
			String text = count.get(i).getText();
			ts.add(text);
		}
		System.out.println(".........after soring the elements.......");
		System.out.println(ts);
		System.out.println();
		System.out.println("....using for loop......");
		for(String so:ts)
		{
			System.out.println(so);
		}
		driver.close();
	}

}
