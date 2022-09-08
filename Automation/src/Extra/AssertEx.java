package Extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEx {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void demoAssert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String exp="Google";
		String act=driver.getTitle();
		Assert.assertEquals(exp, act);
		driver.close();
	}
}
