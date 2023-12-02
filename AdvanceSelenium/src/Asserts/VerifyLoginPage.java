package Asserts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLoginPage {
	@Test
	public void script() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		String actual = driver.getTitle();
		String expected = "Facebook – log in or sign up";
		Assert.assertEquals(actual,expected);
		Thread.sleep(1000);
		driver.quit();
	}

}
