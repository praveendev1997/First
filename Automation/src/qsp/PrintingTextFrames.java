package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingTextFrames {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/frames");
		Thread.sleep(2000);
		List<WebElement> all = driver.findElements(By.xpath("//iframe"));
		int count = all.size();
		System.out.println("count= :"+count);
		for(int i=0;i<count;i++)
		{
			String id = all.get(i).getAttribute("id");
			if(id.equals("frame1")||id.equals("frame2")) {
			driver.switchTo().frame(i);
			String text =driver.findElement(By.xpath("//h1")).getText();
			System.out.println(text);
			driver.switchTo().parentFrame();
			}
		}
		driver.close(); 

}
}
