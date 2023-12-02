package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopRegister {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("vishnu2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("palani2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("vishnuk2@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Kannan@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("Kannan@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='register-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("vishnuk2@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Kannan@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}

}
