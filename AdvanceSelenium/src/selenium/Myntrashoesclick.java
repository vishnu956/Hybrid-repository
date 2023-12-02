package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntrashoesclick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products')]")).sendKeys("shoes");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='results-base']/li[5]")).click();



	}

}
