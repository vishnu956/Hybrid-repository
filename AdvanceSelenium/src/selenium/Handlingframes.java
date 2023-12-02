package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingframes {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/frames");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.xpath("//iframe[@title='Login Form']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vishnusams");
		Thread.sleep(1000);
		driver.quit();


	}

}
