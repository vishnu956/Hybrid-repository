package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoappskeyboardactions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Keyboard Actions']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Keyboard']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("vishnusams@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Kannan@123");
		Thread.sleep(1000);
		driver.findElement(By.id("confirmPassword")).sendKeys("Kannan@123");
		Thread.sleep(1000);
		WebElement submit=driver.findElement(By.xpath("//button[text()='Press Enter to Submit']"));
		submit.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.quit();



		



	}

}
