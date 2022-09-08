//script to write 'HackerEarth + Vtiger CRM' text present in the web page or not after double clicking read full story button

package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerDoubleClick {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement res = driver.findElement(By.partialLinkText("Resources"));
		a.moveToElement(res).perform();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Customers")).click();
		Thread.sleep(1000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		WebElement target = driver.findElement(By.linkText("READ FULL STORY"));
		a.doubleClick(target).perform();
		String text = "HackerEarth + Vtiger CRM";
		String text2 = driver.findElement(By.xpath("//h1[.='HackerEarth + Vtiger CRM']")).getText();
		if(text.contains(text2))
		{
			System.out.println("'HackerEarth + Vtiger CRM' text present in the webpage");
		}
		else
		{
			System.out.println("'HackerEarth + Vtiger CRM' text is not present in the webpage");

		}
		driver.close();
		
	}

}
