package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeDisplayResolution {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Dimension D = new Dimension(500,500);
		driver.manage().window().setSize(D);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.quit();


	}

}
