package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']")).sendKeys("InstragramLogin");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Password@123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(5000);
		driver.quit();


		// TODO Auto-generated method stub

	}

}
