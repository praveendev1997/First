package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckBox {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the url");
		String url=sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		List<WebElement> tbox = driver.findElements(By.xpath("//input[@ type='checkbox']"));
		int count = tbox.size();
		System.out.println("check box present "+count);
		Thread.sleep(2000);
		for(int i=0;i<count;i++)
		{
			tbox.get(i).click();
		}
		
		driver.close();

	}

}
