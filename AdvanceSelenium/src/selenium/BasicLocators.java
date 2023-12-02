package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicLocators {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/vishn/OneDrive/Desktop/DummyData.html");
		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).sendKeys("Hello");
		Thread.sleep(1000);
		driver.findElement(By.id("text-field")).sendKeys("World");
		Thread.sleep(1000);
		driver.findElement(By.className("c1")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("n1")).click();
		driver.quit();

		
		
		

	}

}
