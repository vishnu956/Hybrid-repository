package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchpriceinparallelbrowser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@title,'Search')]")).sendKeys("iphone 15");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
        WebElement iPhone = driver.findElement(By.xpath("//div[text()='APPLE iPhone 15 (Blue, 128 GB)']/../../div[2]/div[1]/div[1]/div"));
		Thread.sleep(1000);
		String text = iPhone.getText();
		System.out.println(text);
		Thread.sleep(1000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15");
		Thread.sleep(1000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
        WebElement iPhone1 = driver.findElement(By.xpath("(//span[contains(text(),'Apple iPhone 15 (128 GB) - Blue')])[1]/../../../../div[2]/div/div/div/div/div[2]/div/a/span/span/span[2]"));
		Thread.sleep(1000);
		String text1 = iPhone1.getText();
		System.out.println(text1);
        Thread.sleep(1000);
		driver.quit();

}
}
