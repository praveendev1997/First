package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenderRadioButtonAllignFB {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		Thread.sleep(2000);
		int female = driver.findElement(By.xpath("//label[text()='Female']")).getLocation().getY();
		int male = driver.findElement(By.xpath("//label[text()='Male']")).getLocation().getY();
		int custom = driver.findElement(By.xpath("//label[text()='Custom']")).getLocation().getY();
		
		if(female==male && male==custom)
		{
			System.out.println("all radio button are alligned properly");
		}
		else
		{
			System.out.println("it is not proprly arranged");
		}
		driver.close();
	}

}
