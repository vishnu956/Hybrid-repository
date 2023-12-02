package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionwithTextField {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/vishn/OneDrive/Desktop/Dummy%20Page.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("Hello World");
		Thread.sleep(2000);
		driver.quit();
		// TODO Auto-generated method stub

	}

}
