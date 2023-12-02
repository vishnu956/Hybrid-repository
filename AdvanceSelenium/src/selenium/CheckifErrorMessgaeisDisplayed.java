package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckifErrorMessgaeisDisplayed 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("1245RFyyhhjj");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("ui789004556");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		boolean torf=driver.findElement(By.xpath("//span[contains(text(),'Please enter a valid email address')]")).isDisplayed();
		Thread.sleep(1000);
		System.out.println(torf);
		Thread.sleep(1000);
		driver.quit();
	}


		


		


}
