package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement block1 = driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement block2 = driver.findElement(By.xpath("//h1[.='Block 4']"));
		Actions a=new Actions(driver);
		Thread.sleep(1000);
		a.dragAndDrop(block1, block2).perform();
		Thread.sleep(1000);
		driver.close();
	}

}
