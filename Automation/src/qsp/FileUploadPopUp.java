package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/OneDrive/Desktop/Selenium%20Example%20Html/noukri.html");
		// convert the relative path to absolute path
		File f=new File("./data/res.docx");
		String absPath = f.getAbsolutePath();
		Thread.sleep(2000);
		//pass absolute path as an argument for sendkeys method
		driver.findElement(By.id("cv")).sendKeys(absPath);

	}

}
