package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCLatestNews {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> links = driver.findElements(By.xpath("//span[@ class='top-list-item__bullet']/../../../li/a"));
		int count = links.size();
		System.out.println(count);
		/*for(int i=0;i<count;i++)   //using for loop
		{
			System.out.println(links.get(i).getText());
		}
		*/
		for(WebElement e:links)
		{
			System.out.println(e.getText());
		}
		driver.close();
	}

}
