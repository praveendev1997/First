package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlyDuplicatesFronListBox {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/OneDrive/Desktop/Selenium%20Example%20Html/hotel.html");
		WebElement mlb = driver.findElement(By.id("mtr"));
		Select s=new Select(mlb);
		HashSet<String > hs=new HashSet<String>();
		List<WebElement> count = s.getOptions();
		for(int i=0;i<count.size();i++)
		{
			String text = count.get(i).getText();
			
			if(hs.add(text)==false)
				System.out.println(text);
		}
		driver.close();
	}

}
