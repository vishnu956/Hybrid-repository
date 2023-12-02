package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/frames");
		Thread.sleep(1000);
		WebElement frm1=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frm1);
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("Hi");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
		Thread.sleep(1000);
		WebElement frm2=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frm2);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("Hello");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Multiple iframe']")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("username")).sendKeys("Hello");
		Thread.sleep(1000);
        driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("New World");
        Thread.sleep(1000);
		driver.quit();





	}

}
