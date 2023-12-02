package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handledisabledelementsindemoapps {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
		Thread.sleep(1000);
		WebElement disabledtext=driver.findElement(By.xpath("//input[@id='name']"));
		Thread.sleep(1000);
		WebElement disabledemail=driver.findElement(By.xpath("//input[@id='email']"));
		Thread.sleep(1000);
		WebElement disabledpass=driver.findElement(By.xpath("//input[@id='password']"));
		Thread.sleep(1000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Vishnu'",disabledtext);
		Thread.sleep(1000);
		js.executeScript("arguments[0].value='vishnusams@gmail.com'",disabledemail);
		Thread.sleep(1000);
		js.executeScript("arguments[0].value='Kannan@123'",disabledpass);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(1000);
		driver.quit();



	}

}
