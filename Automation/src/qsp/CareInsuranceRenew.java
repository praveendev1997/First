package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsuranceRenew {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[1]"));
		Select s=new Select(month);
		s.selectByIndex(6);
		WebElement year = driver.findElement(By.xpath("//select[2]"));
		Select s1=new Select(year);
		Thread.sleep(2000);
		s1.selectByVisibleText("1997");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='2']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("8746883554");
		driver.findElement(By.id("renew_policy_submit")).click();
		String text = driver.findElement(By.id("policynumberError")).getText();
		if(text.equals("Please enter valid Policy No."))
		{
			System.out.println("'Please enter valid Policy No.'-->displayed");
		}
		else
		{
			System.out.println("'Please enter valid Policy No.'--> not displayed");
		}
		driver.close();
	}

}
