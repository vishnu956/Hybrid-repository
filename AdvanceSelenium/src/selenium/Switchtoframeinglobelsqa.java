package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtoframeinglobelsqa {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='iFrame']")).click();
		Thread.sleep(1000);
		WebElement frm1=driver.findElement(By.xpath("//iframe[@name='globalSqa']"));
		driver.switchTo().frame(frm1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("newtext");
		Thread.sleep(1000);
		driver.close();


	}

}
