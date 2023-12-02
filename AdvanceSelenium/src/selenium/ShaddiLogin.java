package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShaddiLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shaadi.com/lets-begin/matrimony");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid='login_link']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vishnusams@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Kannan@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.quit();

		// TODO Auto-generated method stub

	}

}
