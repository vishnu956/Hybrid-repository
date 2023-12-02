package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instragrammessage {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("kannan5289");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Kannan@123");;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
        //driver.findElement(By.xpath("//span[text()='Search']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@aria-label='Search input']")).sendKeys("sandeep");
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[text()='sandeepshadakshari']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Messages']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Send message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("sandeep");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'sandeepshadakshari')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@role='button'])[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-label='Message']")).sendKeys("Assignment done");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		Thread.sleep(1000);








	}

}
