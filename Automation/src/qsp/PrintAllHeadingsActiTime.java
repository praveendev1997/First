package qsp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllHeadingsActiTime {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("About your actiTIME")).click();
		String cw = driver.getWindowHandle();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Read Service Agreement")).click();
		/*@SuppressWarnings("unchecked")
		ArrayList<String>tabs=(ArrayList<String>) driver.getWindowHandles();// converting set to arrayList
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
		driver.findElements(By.xpath("//h2"));
		List<WebElement> headings = driver.findElements(By.xpath("//h2"));
		for(int i=1;i<headings.size();i++)
		{
			String text = headings.get(i).getText();
			System.out.println(text);
		}
		driver.quit();*/
		
		Set<String> all = driver.getWindowHandles();   //using iterator
		System.out.println(all);
		Iterator<String> it=all.iterator();
		while(it.hasNext())
		{
			String nextW = it.next();
			if(!(cw.equals(nextW)))
			{
				String title = driver.switchTo().window(nextW).getTitle();
				System.out.println(title);
				List<WebElement> headings = driver.findElements(By.xpath("//h2"));
				for(int i=1;i<headings.size();i++)
				{
					String text = headings.get(i).getText();
					System.out.println(text);
				}
			}	
		}
		driver.quit();
	}
}
