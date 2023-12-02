package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqainsert3datas {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='delete-record-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='delete-record-2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='delete-record-3']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Vishnu");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kannan");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Kannan@gmail.com");  
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("28");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("28000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='department']")).sendKeys("Accounts");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Kamal");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kannan");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Kannan123@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("30");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("50000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='department']")).sendKeys("Testing");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Rama");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("chandran");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("VishnuRam123@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("34");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("80000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='department']")).sendKeys("SDET");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(1000);


   }

}
