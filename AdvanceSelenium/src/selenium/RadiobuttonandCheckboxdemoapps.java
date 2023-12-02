package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonandCheckboxdemoapps {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[contains(text(),'1. What method do you prefer to make payment?')]/../main/div[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[contains(text(),'2.When do you want your order to be delivered')]/../main/div[1]/div[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[contains(text(),'1. Which option do you want to get notified ?')]/../main/div[2]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[contains(text(),'2. Do you prefer to receive recommendation for similar products?')]/../main/div[2]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[contains(text(),'3. Are you interested in receiving any customer assistance for this product?')]/../main/div[2]/input")).click();
		Thread.sleep(1000);








	}

}
