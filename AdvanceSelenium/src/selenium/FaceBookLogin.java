package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("hello@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("password@123");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		driver.quit();
		// TODO Auto-generated method stub

	}

}
