package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldownandupbyforloop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=0;i<2;i++)
		{
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		}
		for(int i=0;i<2;i++)
		{
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(1000);
		}
		driver.quit();



	}

}

	


