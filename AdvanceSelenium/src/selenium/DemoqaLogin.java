package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoqaLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(1000);
		driver.findElement(By.id("userName")).sendKeys("Vishnu");
		Thread.sleep(1000);
		driver.findElement(By.id("userEmail")).sendKeys("vishnusams@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("currentAddress")).sendKeys("Bengaluru Karnataka");
		Thread.sleep(1000);
		driver.findElement(By.id("permanentAddress")).sendKeys("Bengaluru Karnataka");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		driver.quit();
		
		// TODO Auto-generated method stub

	}

}
