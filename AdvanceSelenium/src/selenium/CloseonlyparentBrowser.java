package selenium;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseonlyparentBrowser {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(1000);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("messageWindowButton")).click();
		Thread.sleep(1000);
		String parent_id = driver.getWindowHandle();
		Thread.sleep(1000);
		Set<String> all_id = driver.getWindowHandles();
		for(String id:all_id)
		{
			driver.switchTo().window(id);
			if(parent_id.equals(id))
			{
				driver.close();
			}
			else
			{
			String url = driver.getCurrentUrl();
			System.out.println(url);
        Thread.sleep(1000);
			}
        
		}

	}

}
