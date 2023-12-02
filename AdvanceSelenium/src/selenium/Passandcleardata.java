package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Passandcleardata {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Disabled")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[text()='Yes'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[text()='Yes'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(1000);
		WebElement disabled=driver.findElement(By.xpath("//button[text()='Submit']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",disabled);
        Thread.sleep(1000);
        driver.quit();







	}

}
