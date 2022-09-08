package qsp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchSpecificIndexFromListBox {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the item to search");
		String item=sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/OneDrive/Desktop/Selenium%20Example%20Html/hotel.html");
		WebElement mlb = driver.findElement(By.id("mtr"));
		Select s=new Select(mlb);
		List<WebElement> all = s.getOptions();
		ArrayList al=new ArrayList<>();
		for(int i=0;i<all.size();i++)
		{
			String text = all.get(i).getText();
			al.add(text);
		}
		if(al.contains(item))
			System.out.println(item+" is present");
		else
			System.out.println(item+ " is not present");
		driver.close();
	}

}
