package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlehiddenelementusingjavascript 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(1000);
		WebElement hiddentext=driver.findElement(By.name("custom-gender"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Helloworld'",hiddentext);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='custom']")).click();
		Thread.sleep(1000);
		driver.quit();

		

}

}
