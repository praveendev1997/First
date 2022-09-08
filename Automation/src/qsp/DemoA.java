package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

 class Dem {
	static void testA(WebDriver driver)
	{
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}
 public class DemoA{
	 static {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	 }
	 public static void main(String[] args)
	 {
		 WebDriver driver=new ChromeDriver();
		 Dem.testA(driver);
		 WebDriver driver1=new FirefoxDriver();
		 Dem.testA(driver1);
		 
		 
	 }
 }
