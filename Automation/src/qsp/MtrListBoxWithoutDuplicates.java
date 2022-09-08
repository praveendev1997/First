package qsp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrListBoxWithoutDuplicates {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/OneDrive/Desktop/Selenium%20Example%20Html/hotel.html");
		WebElement mtrlb = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlb);
		List<WebElement> all = s.getOptions();
		HashSet<String> se=new HashSet<String>();
		System.out.println(all.size());
		for( int i=0;i<all.size();i++)
		{
			String text = all.get(i).getText();
			se.add(text);
			System.out.println(text);
		}
		System.out.println("after removing duplicates");
		System.out.println("..................");
		System.out.println(se);
		System.out.println("using for each loop");
		System.out.println(".....................");
		System.out.println(se.size());
		for(String a:se)
		{
			System.out.println(a);
		}
		
		driver.close();
	}

}
